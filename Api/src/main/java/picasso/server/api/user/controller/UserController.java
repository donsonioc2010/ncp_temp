package picasso.server.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.member.dto.UserDTO;

@RestController
@RequestMapping("/api/user")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/signup")
  public ResponseEntity<?> signUp(@RequestBody UserDTO requestDto) {
    userService.signUp(requestDto);
    return ResponseEntity.ok().build();
  }
}

