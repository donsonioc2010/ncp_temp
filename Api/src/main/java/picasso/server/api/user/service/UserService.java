package picasso.server.api.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public void saveUser(User user) {
    userRepository.save(user);
  }

  public List<User> findAllUsers() {
    return userRepository.findAll();
  }


  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }

  public Optional<User> findUserByNickname(String nickname) {
    return userRepository.findByNickName(nickname);
  }


  public List<User> findAllMembers() {
    return userRepository.findAll();
  }



//
//  public User findByEmail(String email) {
//    return userRepository.findByEmail();
//  }

}



