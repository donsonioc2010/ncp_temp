package picasso.server.api.admin.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import picasso.server.api.admin.exception.NotAdminUserException;
import picasso.server.api.admin.service.AdminService;
import picasso.server.domain.domains.admin.vo.request.SignUpAdminRequestDto;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;
import picasso.server.domain.domains.user.type.UserRole;



@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;
    private final UserRepository userRepository;

    @PostMapping("/approve/{pictureId}")
    public String approvePicture(@PathVariable Long pictureId, HttpSession session) {
        isSessionUserAdmin(session);
        adminService.approvePicture(pictureId);
        return "redirect:/admin/approvelist";
    }

    /**
     * 관리자 페이지 미승인된 게시물 조회 Page
     *
     * @param model
     * @param session
     * @return
     */

    @GetMapping("/approvelist")
    public String approvelist(Model model, HttpSession session) {
        isSessionUserAdmin(session);
        model.addAttribute("pictures", adminService.findAllPicture());
        return "admin/approvelist";
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
        isSessionUserAdmin(session);
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


    @GetMapping("/form")
    public String AdminForm(HttpSession session) {
        isSessionUserAdmin(session);
        return "admin/form";
    }

    /**
     * 관리자 계정 생성
     *
     * @param dto
     * @param session
     * @return
     */
    @PostMapping("/form")
    public String addAdmin(SignUpAdminRequestDto dto, HttpSession session) {
        isSessionUserAdmin(session);
        User user = User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .nickName(dto.getNickName())
                .userRole(UserRole.ADMIN)
                .build();

        userRepository.save(user);

        return "auth/login";
    }

    /**
     * 관리자 계정 조회
     *
     * @param model
     * @param session
     * @param userRole
     * @return
     */


    @GetMapping("/user/list")
    public String adminUserList(@RequestParam(name = "userRole", defaultValue = "ADMIN") String userRole, HttpSession session, Model model) {
        isSessionUserAdmin(session);

        if ("ADMIN".equals(userRole)) {
            model.addAttribute("users", adminService.findAllAdmin());
        } else if ("USER".equals(userRole)) {
            model.addAttribute("users", adminService.findAllUser());
        }

        return "admin/memberList";
    }


    @PostMapping("/suspend/{userId}")

        public String suspendUser(@PathVariable Long userId, HttpSession session) {
            isSessionUserAdmin(session);
            adminService.suspendUser(userId);
            return "redirect:/admin/user/list?status=USER";


        }

}