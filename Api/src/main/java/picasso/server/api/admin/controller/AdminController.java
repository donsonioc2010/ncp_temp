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
            adminService.approvePicture(pictureId);
            return "redirect:/admin/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Picture> pictures = adminService.findAll();
        model.addAttribute("pictures", pictures);

        return "admin/list";
    }

    @GetMapping("/detail/{pictureId}")
    public String detail(@PathVariable Long pictureId, Model model) {
        Optional<Picture> pictureOptional;
        pictureOptional = adminService.findById(pictureId);
        pictureOptional.ifPresent(picture -> model.addAttribute("picture", picture));

        return "admin/detail";
    }
}
