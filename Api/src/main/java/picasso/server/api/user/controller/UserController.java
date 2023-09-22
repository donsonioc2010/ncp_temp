package picasso.server.api.user.controller;//package picasso.server.api.user.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import picasso.server.api.user.service.UserService;
//import picasso.server.domain.domains.dto.UserDTO;
//import picasso.server.domain.domains.user.entity.User;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//  private final UserService userService;
//  private final ObjectMapper objectMapper;
//
//  @Autowired
//  public UserController(UserService userService) {
//    this.userService = userService;
//  }
//
//  @GetMapping("/form")
//  public String form(@CookieValue(required = false) String email, Model model) {
//    model.addAttribute("UserDTO", new UserDTO());
//    return "user/form";
//  }
//
//  @PostMapping("form")
//  public ResponseEntity<User> signUp(@RequestBody UserDTO userDto) {
//    User registeredUser = userService.signUp(userDto);
//    return ResponseEntity.ok(registeredUser);
//  }
//
//  @PostMapping("login")
//  public ResponseEntity<User> login(@RequestBody UserDTO userDTO) {
//    return ResponseEntity.ok();
//  }
//}

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.dto.UserDTO;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("form")
  public String showSignUpForm() {
    return "user/form";
  }

  @PostMapping("form")
  public String handleSignUp(@RequestBody UserDTO userDto) {
    userService.signUp(userDto);
    return "redirect:/";
  }
}

