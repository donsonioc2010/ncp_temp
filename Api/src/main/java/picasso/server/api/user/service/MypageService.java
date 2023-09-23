package picasso.server.api.user.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.user.repository.MypageRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class MypageService {

  private final MypageRepository mypageRepository;


}

