package picasso.server.domain.domains.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.user.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);

  Optional<User> findByNickName(String nickName);

}