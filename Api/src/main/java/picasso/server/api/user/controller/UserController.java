package picasso.server.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

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
}
