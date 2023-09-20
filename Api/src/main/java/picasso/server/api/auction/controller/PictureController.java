package picasso.server.api.auction.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import picasso.server.api.auction.service.PictureService;
import picasso.server.common.util.NaverObjectStorageUsageType;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.dto.PictureDTO;
import picasso.server.domain.domains.items.Picture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Controller
@RequestMapping("/pictures")
@RequiredArgsConstructor
public class PictureController {

    private final PictureService pictureService;
    private final NaverObjectStorageUtil naverObjectStorageUtil;
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("PictureDTO", new PictureDTO());
        return "pictures/createPictureForm";
    }

    @PostMapping
    public String add(PictureDTO dto, MultipartFile imageFile, Model model) {
        Picture picture = new Picture();
        picture.setPicture_id(dto.getPicture_id());
        picture.setPictureName(dto.getPictureName());
        picture.setPainterName(dto.getPainterName());
        picture.setSize(dto.getSize());
        picture.setDetails(dto.getDetails());
        picture.setStartingPrice(dto.getStartingPrice());
        picture.setIncrementAmount(dto.getIncrementAmount());
        picture.setBidStartDate(dto.getDateTime());
        //희망 경매일자 + 7일
        picture.setBidEndDate(dto.getDateTime().plusDays(7));

        List<String> imageUrls = new ArrayList<>();
        if (imageFile != null && !imageFile.isEmpty()) {
            String imageUrl = naverObjectStorageUtil.storageFileUpload(NaverObjectStorageUsageType.PAINT, imageFile);
            picture.setImgUrl(imageUrl);
            imageUrls.add(imageUrl);
            model.addAttribute("imageUrls", imageUrls);
            model.addAttribute("imgURL", imageUrl);
        }




        pictureService.saveItem(picture); //- 이 부분은 필요에 따라 주석처리
        return "redirect:/";
    }

    @GetMapping("/list")
    public String imgUrls(Model model) {
//        List<String> imageUrls = pictureService.extractImageUrlsSortedByDateTime();
//        model.addAttribute("imageUrls", imageUrls);
        Map<String, List<?>> pictureDataMap = new HashMap<>();


        List<String> imageUrls = pictureService.extractImageUrlsSortedByDateTime();
        List<String> details = pictureService.extractDetail();
        List<String> pictureNames = pictureService.extractPictureName();
        List<String> painterNames = pictureService.extractPainterName();
        List<Integer> startPrices = pictureService.extractStartPrice();
        List<Integer> incrementAmounts = pictureService.extractIncrementAmount();

        pictureDataMap.put("imageUrls", imageUrls);
        pictureDataMap.put("details", details);
        pictureDataMap.put("pictureNames", pictureNames);
        pictureDataMap.put("painterNames", painterNames);
        pictureDataMap.put("startPrices", startPrices);
        pictureDataMap.put("incrementAmounts", incrementAmounts);


        model.addAttribute("imageUrls", imageUrls);
//        model.addAttribute("details", details);
//        model.addAttribute("picturesNames", pictureNames);
//        model.addAttribute("painterNames", painterNames);
//        model.addAttribute("startPrices", startPrices);
//        model.addAttribute("incrementAmounts", incrementAmounts);
        model.addAttribute("pictureDataMap", pictureDataMap);
        return "imageList"; // Change to your Thymeleaf template name
    }

}
