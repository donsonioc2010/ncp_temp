package picasso.server.api.auction.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.domain.domains.dto.PictureDTO;
import picasso.server.domain.domains.items.Picture;
import picasso.server.api.auction.service.PictureService;

@Controller
@RequestMapping("/pictures")
@RequiredArgsConstructor
public class PictureController {

    private final PictureService pictureService;


    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("PictureDTO", new PictureDTO());
        return "pictures/createPictureForm";
    }

    @PostMapping
    public String create(PictureDTO dto) {

        Picture picture = new Picture();
        picture.setPicture_id(dto.getPicture_id());
        picture.setPictureName(dto.getPictureName());
        picture.setPainterName(dto.getPainterName());
        picture.setSize(dto.getSize());
        picture.setDetails(dto.getDetails());
        picture.setIncrementAmount(dto.getIncrementAmount());
        picture.setImgUrl(dto.getImgUrl());

        pictureService.saveItem(picture);
        return "redirect:/pictures";
    }

}
