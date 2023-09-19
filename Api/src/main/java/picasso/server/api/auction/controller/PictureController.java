package picasso.server.api.auction.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import picasso.server.common.util.NaverObjectStorageUsageType;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.dto.PictureDTO;
import picasso.server.domain.domains.items.Picture;
import picasso.server.api.auction.service.PictureService;
import picasso.server.domain.domains.items.PictureStatus;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/pictures")
@RequiredArgsConstructor
public class PictureController {

    private final PictureService pictureService;
    private final NaverObjectStorageUtil naverObjectStorageUtil;
    List<String> imageUrls = new ArrayList<>();


    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("PictureDTO", new PictureDTO());
        return "pictures/createPictureForm";
    }

//    @PostMapping
//    public String add(PictureDTO dto, MultipartFile imageFile, Model model) {
//
//        Picture picture = new Picture();
//        picture.setPicture_id(dto.getPicture_id());
//        picture.setPictureName(dto.getPictureName());
//        picture.setPainterName(dto.getPainterName());
//        picture.setSize(dto.getSize());
//        picture.setDetails(dto.getDetails());
//        picture.setIncrementAmount(dto.getIncrementAmount());
//
//        if (imageFile != null && !imageFile.isEmpty()) {
//            try {
//                String imageUrl = naverObjectStorageUtil.storageFileUpload(NaverObjectStorageUsageType.PAINT, imageFile);
//                picture.setImgUrl(imageUrl);
//                model.addAttribute("imgURL", imageUrl);
//                uploadedImageUrls.add(imageUrl);
//                System.out.println(imageUrl);
//            } catch (Exception e) {
//                e.printStackTrace();
//                return "redirect:/error"; // Redirect to an error page
//            }
//        }
//        pictureService.saveItem(picture);
//        return "redirect:/";
//    }


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
        picture.setDateTime(dto.getDateTime());
        PictureStatus status = PictureStatus.BEFORE_APPROVE;
        picture.setPictureStatus(status);
        if (imageFile != null && !imageFile.isEmpty()) {
            try {
                String imageUrl = naverObjectStorageUtil.storageFileUpload(NaverObjectStorageUsageType.PAINT, imageFile);
                picture.setImgUrl(imageUrl);
                imageUrls.add(imageUrl);
                model.addAttribute("imageUrls", imageUrls);
                model.addAttribute("imgURL", imageUrl);

            } catch (Exception e) {
                e.printStackTrace();
                return "redirect:/error"; // Redirect to an error page
            }
        }

         pictureService.saveItem(picture); //- 이 부분은 필요에 따라 주석처리
        return "redirect:/";
    }

    @GetMapping("/list")
    public String imgUrls(Model model) {
        List<String> imageUrls = pictureService.extractImageUrlsSortedByDateTime();
        model.addAttribute("imageUrls", imageUrls);
            System.out.println(imageUrls.get(1));
        return "imageList"; // Change to your Thymeleaf template name
    }




}
