package picasso.server.api.user.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.repository.UserRepository;
import picasso.server.domain.domains.user.entity.User;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final ObjectMapper objectMapper;
  private HttpServletResponse response;

  public User signUp(UserDTO userDto) {

    User user = new User();
    user.setEmail(userDto.getEmail());
    user.setPassword(userDto.getPassword());
    user.setNickName(userDto.getNickName());

    return userRepository.save(user);
  }

  public HttpServletResponse login(UserDTO userDto) throws JsonProcessingException {

    User user = new User();
    user.setEmail(userDto.getEmail());
    user.setPassword(userDto.getPassword());

    String userJson = objectMapper.writeValueAsString(user);

    Cookie userCookie = new Cookie("user", userJson);
    response.addCookie(userCookie);

//    if (response.equals(user.get))

      return response;

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
}
