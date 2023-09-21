package picasso.server.api.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.repository.UserRepository;
import picasso.server.domain.domains.user.entity.User;

import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }



  public User signUp(UserDTO requestDto) throws Exception {

    Optional<User> existingUser = userRepository.findByEmail(requestDto.getEmail());
    if (existingUser.isPresent()) {
      throw new Exception("이미 사용 중인 이메일입니다.");
    }

    User user = new User();
    user.setEmail(requestDto.getEmail());
    user.setPassword(requestDto.getPassword());
    user.setNickName(requestDto.getNickName());

    return userRepository.save(user);
  }

  public User login(String email, String password) throws Exception {
    Optional<User> optionalUser = userRepository.findByEmail(email);
    if (optionalUser.isEmpty()) {
      throw new Exception("사용자를 찾을 수 없습니다.");
    }

    User user = optionalUser.get();

    if (!user.getPassword().equals(password)) {
      throw new Exception("비밀번호가 일치하지 않습니다.");
    }

    return user;
  }
}
