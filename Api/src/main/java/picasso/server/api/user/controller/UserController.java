package picasso.server.api.user.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.dto.UserDto;
import picasso.server.domain.domains.user.entity.User;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("/new")
  public String createForm() {
    return "user/UserForm";
  }

  @PostMapping
  public String add(UserDto dto, Model model) {
    userService.saveUser(UserDto.userEntity(dto));
    return "redirect:/";
  }

  @GetMapping("/list")
  public String listMembers(Model model) {
    model.addAttribute("user", userService.findAllUsers());
    return "user/list";
  }

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

  @GetMapping("/form")
  public String form(@CookieValue(required = false) String email,Model model){
    model.addAttribute("UserDTO",new UserDTO());
    return"user/form";
  }

  @PostMapping("form")
  public ResponseEntity<User> signUp(@RequestBody UserDTO userDto){
    User registeredUser=userService.signUp(userDto);
    return ResponseEntity.ok(registeredUser);
  }
}
