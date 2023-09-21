package picasso.server.api.user.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.api.user.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  @GetMapping("/form")
  public String form(@CookieValue(required = false) String email, Model model) {
    model.addAttribute("UserDTO", new UserDTO());
    return "user/form";
  }

  @PostMapping("form")
  public ResponseEntity<User> signUp(@RequestBody UserDTO userDto) {
    User registeredUser = userService.signUp(userDto);
    return ResponseEntity.ok(registeredUser);
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
