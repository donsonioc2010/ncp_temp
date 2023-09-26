package picasso.server.api.auction.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import picasso.server.api.auction.dto.response.PictureBidHistoryAmountCreatedAtResponse;
import picasso.server.api.auction.service.PictureBidHistoryService;
import picasso.server.api.auction.service.PictureService;
import picasso.server.api.user.service.UserService;
import picasso.server.common.exception.NotFoundException;
import picasso.server.common.util.NaverObjectStorageUsageType;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.picture.dto.PictureDTO;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.items.PictureInfo;
import picasso.server.domain.domains.picture.items.PictureStatus;
import picasso.server.domain.domains.user.entity.User;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Slf4j
@Controller
@RequestMapping("/pictures")
@RequiredArgsConstructor
public class PictureController {

    private final PictureService pictureService;
    private final UserService userService;
    private final NaverObjectStorageUtil naverObjectStorageUtil;
    private final PictureBidHistoryService pictureBidHistoryService;

    /**
     * 경매품 게시물에 대해 등록할 수 있는 페이지로 이동한다.
     *
     * @param model
     * @return
     */
    @GetMapping("/new")
    public String createForm(HttpSession session, Model model) {
        if (session.getAttribute("loginUser") == null) {
            throw NotFoundException.EXCEPTION;
        }
        model.addAttribute("PictureDTO", new PictureDTO());
        return "pictures/createPictureForm";
    }

    /**
     * 경매품 등록
     *
     * @param requestDto
     * @param model
     * @param session
     * @return
     */
    @PostMapping
    public String add(PictureDTO requestDto, Model model, HttpSession session) {
        User sessionUser = (User) session.getAttribute("loginUser");
        if (sessionUser == null) {
            return "redirect:/auth/login"; //로그인 페이지로
        }

        userService.findById(sessionUser.getId()).ifPresent(user -> {
            Picture picture = new Picture();
            picture.setPictureId(requestDto.getPictureId());
            picture.setPictureName(requestDto.getPictureName());
            picture.setPainterName(requestDto.getPainterName());
            picture.setSize(requestDto.getSize());
            picture.setDetails(requestDto.getDetails());
            picture.setStartingPrice(requestDto.getStartingPrice());
            picture.setIncrementAmount(requestDto.getIncrementAmount());
            picture.setBidStartDate(requestDto.getBidStartDate());


            //희망 경매일자 + 7일
            picture.setBidEndDate(requestDto.getBidStartDate().plusDays(7));

            List<String> imageUrls = new ArrayList<>();
            if (requestDto.getImageFile() != null && !requestDto.getImageFile().isEmpty()) {
                String imageUrl = naverObjectStorageUtil.storageFileUpload(NaverObjectStorageUsageType.PAINT, requestDto.getImageFile());
                picture.setImgUrl(imageUrl);
                imageUrls.add(imageUrl);
                model.addAttribute("imageUrls", imageUrls);
                model.addAttribute("imgURL", imageUrl);
            }

            picture.setUser(user);
            pictureService.saveItem(picture); //- 이 부분은 필요에 따라 주석처리
        });
        return "redirect:/pictures/list?page=0&pageSize=10&status=BIDDING";
    }

    /**
     * 게시물 리스트 조회
     *
     * @param model
     * @param page     조회할 페이지 Number
     * @param pageSize 한번에 조회할 Size
     * @param status   조회를 희망하는 경매품의 Status
     * @return
     */
    @GetMapping("/list")
    public String imgUrls(Model model,
                          @RequestParam(defaultValue = "0") int page,
                          @RequestParam(defaultValue = "8") int pageSize,
                          @RequestParam(defaultValue = "AFTER_APPROVE") PictureStatus status) {

        Page<PictureInfo> pictureInfoPage = pictureService.preparePictureInfoPage(page, pageSize, status);

        model.addAttribute("pictureInfoPage", pictureInfoPage);
        model.addAttribute("nextPage", page + 1);
        model.addAttribute("previousPage", page - 1);
        model.addAttribute("pageSize", pictureInfoPage.getSize());
        model.addAttribute("pageSize2", pictureInfoPage.getNumberOfElements());

        return "imageList";
    }

    /**
     * 게시물의 상세페이지 조회
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{id}")
    public String viewPictureDetail(@PathVariable Long id, Model model) {
        Picture picture = pictureService.getPictureById(id).orElseThrow(() -> NotFoundException.EXCEPTION);
        model.addAllAttributes(new HashMap<>() {{
            put("picture", picture);
            put("pictureBidHistory",
                    pictureBidHistoryService.getBidAmountListDescByPicture(picture)
                            .stream()
                            .map(
                                    pictureBidHistory -> PictureBidHistoryAmountCreatedAtResponse.builder()
                                            .bidAmount(String.valueOf(pictureBidHistory.getBidAmount()))
                                            .createdAt(pictureBidHistory.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                                            .build()
                            ).toList());
            put("topBidHistory", pictureBidHistoryService.getTopBidAmountByPicture(picture));
        }});
        return "pictures/pictureDetail";
    }
}
