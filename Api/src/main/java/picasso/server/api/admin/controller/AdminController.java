package picasso.server.api.admin.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.admin.exception.NotAdminUserException;
import picasso.server.api.admin.service.AdminService;
import picasso.server.domain.domains.member.entity.User;
import picasso.server.domain.domains.member.type.UserRole;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/approve/{pictureId}")
    public String approvePicture(@PathVariable Long pictureId, HttpSession session) {
        //isSessionUserAdmin(session);
        adminService.approvePicture(pictureId);
        return "redirect:/admin/list";
    }

    /**
     * 관리자 페이지 미승인된 게시물 조회 Page
     *
     * @param model
     * @param session
     * @return
     */
    @GetMapping("/list")
    public String list(Model model, HttpSession session) {
        //isSessionUserAdmin(session);
        model.addAttribute("pictures", adminService.findAll());
        return "admin/list";
    }

    /**
     * 세부 게시물 조회 페이지
     *
     * @param pictureId
     * @param model
     * @param session
     * @return
     */
    @GetMapping("/detail/{pictureId}")
    public String detail(@PathVariable Long pictureId, Model model, HttpSession session) {
        //isSessionUserAdmin(session);
        model.addAttribute(
                "picture",
                adminService.getBeforeApproveStatusPictureDetailById(pictureId)
        );
        return "admin/detail";
    }

    private void isSessionUserAdmin(HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        if (user == null || !user.getUserRole().equals(UserRole.ADMIN)) {
            log.error("ADMIN Auth Not Enough");
            throw NotAdminUserException.EXCEPTION;
        }
    }
}
