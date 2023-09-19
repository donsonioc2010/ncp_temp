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

        }
    @GetMapping("/detail/{picture_id}/{pictureName}")
    public String detail(@PathVariable Long picture_id, @PathVariable String pictureName, Model model) {
        Optional<Picture> pictureOptional = adminService.findById(picture_id);

        pictureOptional.ifPresent(picture -> {
            model.addAttribute("picture", picture);
        });

        Optional<Picture> pictureOptional1 = adminService.findByName(pictureName);

        pictureOptional1.ifPresent(picture -> {
            model.addAttribute("picture", picture);
        });

        return "admin/detail";
    }
}