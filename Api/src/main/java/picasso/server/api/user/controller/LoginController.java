package picasso.server.api.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.dto.UserDTO;

@Controller
@RequestMapping("auth")
@RequiredArgsConstructor
public class LoginController {

  private final UserService userService;

  @GetMapping("login")
  public String showLoginForm() {
    return "auth/login";
  }

  @PostMapping("login")
  public String handleLogin(@ModelAttribute UserDTO userDto) throws JsonProcessingException {
    userService.login(userDto);
    return "redirect:/";
  }
}
