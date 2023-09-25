package picasso.server.api.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
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
            throw new RuntimeException("이미 등록된 이메일입니다."); // 중복 이메일 체크
        }

        User newUser = userRepository.save(User.builder()
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .nickName(userDto.getNickName())
                .build());

       // emailService.sendVerificationEmail(newUser);   sendVerificationEmail: 이메일 전송 로직 추가,,?

        return newUser;
    }

    public Optional<User> login(LoginRequestDto userDto) {
        Optional<User> findUser = userRepository.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
        findUser.ifPresent(user-> user.setLoginAt(LocalDateTime.now()));
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

    public Optional<User> findUserByIdAndEmail(Long userId, String email) {
        return userRepository.findByIdAndEmail(userId, email);
    }

}
