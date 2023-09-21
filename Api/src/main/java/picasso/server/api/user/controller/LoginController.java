package picasso.server.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.entity.User;

@RestController
@RequestMapping("/users")
public class LoginController {

  private final UserService userService;

  @Autowired
  public LoginController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("form")
  public void form(@CookieValue(required = false) String email, Model model) {
    model.addAttribute("email", email);
  }

  @PostMapping("login")
  public ResponseEntity<?> login(@RequestBody UserDTO requestDto) {
    try {
      User authenticatedUser = userService.login(requestDto.getEmail(), requestDto.getPassword());
      return ResponseEntity.ok(authenticatedUser);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
