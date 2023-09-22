package picasso.server.api.user.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import picasso.server.api.user.vo.request.LoginRequestDto;
import picasso.server.api.user.vo.request.SignUpRequestDto;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final ObjectMapper objectMapper;

  public User signUp(SignUpRequestDto userDto) {
    return userRepository.save(User.builder()
            .email(userDto.getEmail())
            .password(userDto.getPassword())
            .nickName(userDto.getNickName())
            .build());
  }

  public Optional<User> login(LoginRequestDto userDto) {
    Optional<User> findUser = userRepository.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
    findUser.ifPresent(user-> user.setLoginAt(LocalDateTime.now()));
    return findUser;
  }

  public boolean isUserValid(UserDTO userDto, HttpServletRequest request) throws JsonProcessingException {
    // 1. 쿠키에서 "user" 데이터를 가져옵니다.
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if ("user".equals(cookie.getName())) {
          // 2. 가져온 데이터를 User 객체로 변환합니다.
          User userFromCookie = objectMapper.readValue(cookie.getValue(), User.class);

          // 3. 변환된 User 객체와 입력받은 UserDTO 데이터를 비교합니다.
          if (userDto.getEmail().equals(userFromCookie.getEmail()) && userDto.getPassword().equals(userFromCookie.getPassword())) {
            return true; // 쿠키의 데이터와 입력된 데이터가 일치합니다.
          }
        }
      }
    }
    return false; // 일치하는 쿠키 데이터가 없거나, 데이터가 입력과 일치하지 않습니다.
  }

  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }
}
