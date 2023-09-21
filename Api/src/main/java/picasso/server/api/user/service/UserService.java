package picasso.server.api.user.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
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

//  public User findByEmail(String email) {
//    return userRepository.findByEmail();
//  }

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

  public User save(User user) {
    return userRepository.save(user);
  }


  public Optional<User> findUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  public Optional<User> findUserByEmailAndPassword(String email, String password) {
    return userRepository.findByEmailAndPassword(email, password);
  }

  public void deleteUserById(Long id) {
    userRepository.deleteById(id);
  }
}
