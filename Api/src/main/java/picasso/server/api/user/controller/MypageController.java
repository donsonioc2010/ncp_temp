package picasso.server.api.user.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import picasso.server.api.user.service.MypageService;
import picasso.server.api.user.service.UserService;
import picasso.server.api.user.vo.request.MyPageRequestDto;
import picasso.server.domain.domains.user.entity.User;

@Slf4j
@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class MypageController {

  private final MypageService mypageService;


  @GetMapping("/mypage")
  public String showMyPage(HttpSession session, Model model) {
    User loginUser = (User) session.getAttribute("loginUser");

    if (loginUser == null) {
      return "redirect:/auth/login";
    }

    User userDetail = mypageService.getUserDetail(loginUser.getId());
    model.addAttribute("user", userDetail);

    return "user/mypage";
  }


  @PostMapping("/update")
  public String handleEdit(MyPageRequestDto requestDto, HttpSession session, Model model) {
    User loginUser = (User) session.getAttribute("loginUser");
    if (loginUser == null) {
      return "redirect:/auth/login";
    }

    MultipartFile profileImage = requestDto.getProfile();

    User user = mypageService.updateUserInfo(session, requestDto);
    if (user == null) {
      return "redirect:/error";
    }
    session.setAttribute("loginUser", user);
    model.addAttribute("user", user);
    return "redirect:/user/mypage";
  }
}
