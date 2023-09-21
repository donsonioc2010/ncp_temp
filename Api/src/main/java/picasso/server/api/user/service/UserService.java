package picasso.server.api.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.repository.UserRepository;
import picasso.server.domain.domains.user.entity.User;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User signUp(UserDTO userDto) {

    User user = new User();
    user.setEmail(userDto.getEmail());
    user.setPassword(userDto.getPassword());
    user.setNickName(userDto.getNickName());

    return userRepository.save(user);
  }

//  public User login(UserDTO userDto) {
//
//    User user = new User();
//    user.setEmail(userDto.getEmail());
//    user.setPassword(userDto.getPassword());
//
//    return userRepository.save(user);
//  }
}
