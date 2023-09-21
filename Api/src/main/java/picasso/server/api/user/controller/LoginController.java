//package picasso.server.api.user.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.support.SessionStatus;
//import picasso.server.api.user.service.UserService;
//import picasso.server.domain.domains.dto.UserDTO;
//import picasso.server.domain.domains.user.entity.User;
//
//@Controller
//@RequestMapping("/user")
//public class LoginController {
//
//  private final UserService userService;
//
//  @Autowired
//  public LoginController(UserService userService) {
//    this.userService = userService;
//  }
//
//  @GetMapping("form")
//  public String form(@CookieValue(required = false) String email, Model model) {
//    model.addAttribute("UserDTO", new UserDTO());
//    return "user/form";
//  }
//
//  @PostMapping
//  public String add(UserDTO dto){
//    User user = new User();
//    user.setEmail(dto.getEmail());
//    user.setPassword(dto.getPassword());
//    user.setNickName(dto.getEmail());
//    return "redirect:/";
//  }
//
//  @PostMapping("login")
//  public ResponseEntity<?> login(@RequestBody UserDTO requestDto) {
//    try {
//      User authenticatedUser = userService.login(requestDto.getEmail(), requestDto.getPassword());
//      return ResponseEntity.ok(authenticatedUser);
//    } catch (Exception e) {
//      return ResponseEntity.badRequest().body(e.getMessage());
//    }
//  }
//
//  @GetMapping("logout")
//  public ResponseEntity<String> logout(SessionStatus sessionStatus) {
//    sessionStatus.setComplete();
//
//    return ResponseEntity.ok("로그아웃");
//  }
//
//}
