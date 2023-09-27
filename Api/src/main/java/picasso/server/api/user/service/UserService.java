package picasso.server.api.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.admin.exception.NotFoundUserException;
import picasso.server.api.exchange.model.request.PostCreatePaymentRequest;
import picasso.server.api.user.exception.EmailErrorException;
import picasso.server.api.user.vo.request.LoginRequestDto;
import picasso.server.api.user.vo.request.SignUpRequestDto;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
  
  private final UserRepository userRepository;
  
  public User signUp(SignUpRequestDto userDto) {
    
    Optional<User> existingUser = userRepository.findByEmail(userDto.getEmail());
    if (existingUser.isPresent()) {
      throw EmailErrorException.EXCEPTION; // 중복 이메일 체크
    }
    
    return userRepository.save(User.builder()
            .email(userDto.getEmail())
            .password(userDto.getPassword())
            .nickName(userDto.getNickName())
            .build());
  }
  
  public Optional<User> login(LoginRequestDto userDto) {
    Optional<User> findUser = userRepository.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
    findUser.ifPresent(user -> user.setLoginAt(LocalDateTime.now()));
    return findUser;
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
  
  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }
  
  @Transactional
  public void updatePoint(PostCreatePaymentRequest request) {
    User findResult = this.findById(request.getUserId()).orElseThrow(()-> NotFoundUserException.EXCEPTION);
    findResult.updatePoint(request.getPaidAmount());
  }
  
  public Optional<User> findUserByIdAndEmail(Long userId, String email) {
    return userRepository.findByIdAndEmail(userId, email);
  }
  
  public Optional<User> findUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }
  
  public Optional<User> findById(Long userId) {
    return userRepository.findById(userId);
  }
}
