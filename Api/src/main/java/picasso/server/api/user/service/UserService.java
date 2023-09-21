
package picasso.server.api.user.service;
//
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.member.entity.User;
import picasso.server.domain.domains.member.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User save(User user) {
    return userRepository.save(user);
  }

  public List<User> findAllUsers() {
    return userRepository.findAll();
  }

  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }

  public Optional<User> findUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  public Optional<User> findUserByEmailAndPassword(String email, String password) {
    return userRepository.findByEmailAndPassword(email, password);
  }

  public Optional<User> findUserByNickname(String nickname) {
    return userRepository.findByNickName(nickname);
  }

  public void deleteUserById(Long id) {
    userRepository.deleteById(id);
  }
}