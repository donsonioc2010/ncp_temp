package picasso.server.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.member.entity.User;
import picasso.server.domain.domains.member.dto.UserDTO;

@RestController
@RequestMapping("/api/user")
public class LoginController {

  @Autowired
  private UserService userService;

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody UserDTO requestDto) {
    try {
      User user = userService.login(requestDto);
      return ResponseEntity.ok().body("로그인 성공!");
    } catch (Exception e) {
      return ResponseEntity.badRequest().body("로그인 실패: " + e.getMessage());
    }
  }
}

