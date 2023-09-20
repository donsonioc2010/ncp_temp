package picasso.server.api.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.member.entity.User;
import picasso.server.domain.domains.member.dto.UserDTO;
import picasso.server.domain.domains.member.repository.UserRepository;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User signUp(UserDTO requestDto) {
    User user = new User();
    user.setEmail(requestDto.getEmail());
    user.setPassword(requestDto.getPassword());
    user.setNickName(requestDto.getNickName());

    return userRepository.save(user);
  }


  public User login(UserDTO requestDto) throws Exception {
    User user = userRepository.findByEmail(requestDto.getEmail());
    if (user == null) {
      throw new Exception("사용자를 찾을 수 없습니다.");
    }
    if (!user.getPassword().equals(requestDto.getPassword())) {
      throw new Exception("비밀번호가 일치하지 않습니다.");
    }

    return user;
  }
}
