package picasso.server.api.auction.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import picasso.server.common.util.NaverObjectStorageUsageType;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.dto.PictureDTO;
import picasso.server.domain.domains.items.Picture;
import picasso.server.api.auction.service.PictureService;

import java.util.ArrayList;
import java.util.List;


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
        picture.setIncrementAmount(dto.getIncrementAmount());

        if (imageFile != null && !imageFile.isEmpty()) {
            try {
                String imageUrl = naverObjectStorageUtil.storageFileUpload(NaverObjectStorageUsageType.PAINT, imageFile);
                picture.setImgUrl(imageUrl);
                model.addAttribute("imgURL", imageUrl);

            } catch (Exception e) {
                e.printStackTrace();
                return "redirect:/error"; // Redirect to an error page
            }
        }


        pictureService.saveItem(picture);
        return "redirect:/";
    }


}
