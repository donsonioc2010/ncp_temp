package picasso.server.api.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import picasso.server.api.admin.service.AdminService;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/approve/{pictureId}")
    public String approvePicture(@PathVariable Long pictureId, Model model) {
        try {
            adminService.approvePicture(pictureId);
            return "redirect:/admin/list";

        } catch (Exception e) {
            List<Picture> pictures = adminService.findAll();
            model.addAttribute("pictures", pictures);
            return "redirect:/admin/list";
        }
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Picture> pictures = adminService.findAll();


        model.addAttribute("pictures", pictures);
        return "admin/list";
    }

    @GetMapping("/detail/{identifier}")
    public String detail(@PathVariable String identifier, Model model) {
        Optional<Picture> pictureOptional;
        if (identifier.matches("\\d+")) {
            Long pictureId = Long.parseLong(identifier);
            pictureOptional = adminService.findById(pictureId);
        } else {
            pictureOptional = adminService.findByPictureName(identifier);
        }

        pictureOptional.ifPresent(picture -> model.addAttribute("picture", picture));

        return "admin/detail";
    }
}
