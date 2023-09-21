package picasso.server.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/signup")
  public ResponseEntity<?> signUp(@RequestBody UserDTO requestDto) {
    try {
      User registeredUser = userService.signUp(requestDto);
      return ResponseEntity.ok(registeredUser); //성공 시, 등록된 사용자 정보를 반환
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage()); // 오류 메시지 반환
    }
  }

  @GetMapping("logout")
  public ResponseEntity<String> logout(SessionStatus sessionStatus) {
    sessionStatus.setComplete();

    return ResponseEntity.ok("로그아웃");
  }
}
