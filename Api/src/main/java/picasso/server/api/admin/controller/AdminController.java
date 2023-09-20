package picasso.server.api.admin.controller;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.admin.service.AdminService;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;


import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {



    private final NaverObjectStorageUtil naverObjectStorageUtil;
    private final AdminService adminService;

    @GetMapping ("/list")
    public String list(Model model) {


        List<Picture> pictures = adminService.findAll();
        model.addAttribute("pictures", pictures);
        return "admin/list";

//        PictureStatus pictureStatus = adminService.findByStatus();
//        if(pictureStatus.getStatus()==pictureStatus.BEFORE_APPROVE) {
//            model.addAttribute()
//        }

     }

    @GetMapping("/detail/{identifier}")
    public String detail(@PathVariable String identifier, Model model) {
        Optional<Picture> pictureOptional;
        if (identifier.matches("\\d+")) {
            Long picture_id = Long.parseLong(identifier);
            pictureOptional = adminService.findById(picture_id);
        } else {
            pictureOptional = adminService.findBypictureName(identifier);
        }

        pictureOptional.ifPresent(picture -> {
            model.addAttribute("picture", picture);
        });

        return "admin/detail";
    }
    }
