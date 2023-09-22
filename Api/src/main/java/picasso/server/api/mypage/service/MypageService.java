package picasso.server.api.mypage.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.MypageRepository;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MypageService {

  private final MypageRepository mypageRepository;
  private final ObjectMapper objectMapper;
  private HttpServletResponse response;


  public void saveUser(User user) {
    mypageRepository.save(user);
  }

  public Optional<User> findUserById(Long id) {
    return mypageRepository.findById(id);
  }
}

