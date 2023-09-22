package picasso.server.api.user.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import picasso.server.api.user.service.MypageService;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.user.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class MypageController {

  private final UserService userService;
  private final MypageService mypageService;

  // 마이페이지 수정 전
  @GetMapping("/mypage")
  public String getUserByEmail(HttpSession session, Model model) {
    User loginUser = (User) session.getAttribute("loginUser");
    if (loginUser == null) {
      // TODO : 사용자 정보 없는 경우 Exception 처리 필요 (로그인을 하지 않은 상태이기 떄문)
    }

    Optional<User> optionalUser = userService.findUserById(loginUser.getId());
    if (optionalUser.isEmpty()) {
      // TODO : 로그인 사용자(세션)는 존재하더라도, DB에서 현재 사용자 정보가 존재하지 않는 경우이기 떄문에 Exception처리가 필요
    }
    model.addAttribute("user", optionalUser.get());
    return "user/mypage";
  }

  // TODO: 테스트용 Controller 입니다. 추후 삭제 혹은 변경이 필요합니다.
  @ResponseBody
  @PostMapping("/session-info")
  public Map<String, Long> paymentSessionInfoRtn(HttpSession session) {
    User temp = (User)session.getAttribute("loginUser");
    return new HashMap<String, Long>(){{
      put("userId", 1L);
    }};
  }
}
