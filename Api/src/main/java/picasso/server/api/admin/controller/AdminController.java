package picasso.server.api.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.admin.service.AdminService;
import picasso.server.common.util.NaverObjectStorageUtil;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.repository.PictureRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final NaverObjectStorageUtil naverObjectStorageUtil;
    private final PictureRepository pictureRepository;
    private final AdminService adminService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Picture> pictures = AdminService.findAll();
        model.addAttribute("pictures", pictures);
        return "admin/list";


        }
    }
}