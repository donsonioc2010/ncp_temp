package picasso.server.api.auction.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import picasso.server.api.auction.service.PictureService;
import picasso.server.api.user.service.UserService;
import picasso.server.common.util.NaverObjectStorageUsageType;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.dto.PictureDTO;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureInfo;
import picasso.server.domain.domains.items.PictureStatus;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j
@Controller
@RequestMapping("/pictures")
@RequiredArgsConstructor
public class PictureController {

    private final PictureService pictureService;
    private final UserService userService;
    private final NaverObjectStorageUtil naverObjectStorageUtil;
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("PictureDTO", new PictureDTO());
        return "pictures/createPictureForm";
    }

    @PostMapping
    public String add(PictureDTO requestDto,Model model, HttpSession session) {

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
            if ( requestDto.getImageFile() != null && !requestDto.getImageFile().isEmpty()) {
                String imageUrl = naverObjectStorageUtil.storageFileUpload(NaverObjectStorageUsageType.PAINT, requestDto.getImageFile());
                picture.setImgUrl(imageUrl);
                imageUrls.add(imageUrl);
                model.addAttribute("imageUrls", imageUrls);
                model.addAttribute("imgURL", imageUrl);
                log.error("Image URL : " + imageUrl);
            }

            picture.setUser(user);
            pictureService.saveItem(picture); //- 이 부분은 필요에 따라 주석처리
        });
        return "redirect:/pictures/list?page=0&pageSize=10&status=BIDDING";
    }

//    @GetMapping("/list")
//    public String imgUrls(Model model) {
////        List<String> imageUrls = pictureService.extractImageUrlsSortedByDateTime();
////        model.addAttribute("imageUrls", imageUrls);
//        Map<String, List<?>> pictureDataMap = new HashMap<>();
//
//
//        List<String> imageUrls = pictureService.extractImageUrlsSortedByDateTime();
//        List<String> details = pictureService.extractDetail();
//        List<String> pictureNames = pictureService.extractPictureName();
//        List<String> painterNames = pictureService.extractPainterName();
//        List<Integer> startPrices = pictureService.extractStartPrice();
//        List<Integer> incrementAmounts = pictureService.extractIncrementAmount();
//
//        pictureDataMap.put("imageUrls", imageUrls);
//        pictureDataMap.put("details", details);
//        pictureDataMap.put("pictureNames", pictureNames);
//        pictureDataMap.put("painterNames", painterNames);
//        pictureDataMap.put("startPrices", startPrices);
//        pictureDataMap.put("incrementAmounts", incrementAmounts);
//
//
//        model.addAttribute("imageUrls", imageUrls);
////        model.addAttribute("details", details);
////        model.addAttribute("picturesNames", pictureNames);
////        model.addAttribute("painterNames", painterNames);
////        model.addAttribute("startPrices", startPrices);
////        model.addAttribute("incrementAmounts", incrementAmounts);
//        model.addAttribute("pictureDataMap", pictureDataMap);
//        return "imageList"; // Change to your Thymeleaf template name
//    }

//    @GetMapping("/list")
//    public String imgUrls(Model model,
//                          @RequestParam(defaultValue = "0") int page,
//                          @RequestParam(defaultValue = "7") int pageSize,
//                          @RequestParam(defaultValue = "AFTER_APPROVE") PictureStatus status
//    ) {
//        Page<String> imageUrlsPage = pictureService.extractImageUrlsSortedByDateTime(page, pageSize, status);
//
//        Map<String, Object> pictureDataMap = new HashMap<>();
//        pictureDataMap.put("imageUrls", imageUrlsPage.getContent());
//        pictureDataMap.put("details", pictureService.extractDetail(status));
//        pictureDataMap.put("pictureNames", pictureService.extractPictureName(status));
//        pictureDataMap.put("painterNames", pictureService.extractPainterName(status));
//        pictureDataMap.put("startPrices", pictureService.extractStartPrice(status));
//        pictureDataMap.put("incrementAmounts", pictureService.extractIncrementAmount(status));
//        pictureDataMap.put("dateDifferences", pictureService.extractEndDay(status));
//
//        model.addAttribute("imageUrls", imageUrlsPage);
//        model.addAttribute("pictureDataMap", pictureDataMap);
//        model.addAttribute("nextPage", page + 1);
//        model.addAttribute("previousPage", page - 1);
//        model.addAttribute("pageSize", imageUrlsPage.getSize());
//        model.addAttribute("pageSize2", imageUrlsPage.getNumberOfElements());
//
//        return "imageList";
//    }

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

    @GetMapping("/{id}")
    public String viewPictureDetail(@PathVariable Long id, Model model) {
        Optional<Picture> pictureOptional = pictureService.getPictureById(id);

        if(pictureOptional.isPresent()) {
            Picture picture = pictureOptional.get();
            model.addAttribute("picture", picture);
            return "pictures/pictureDetail";
        } else {
            return "error";
        }
    }
}
