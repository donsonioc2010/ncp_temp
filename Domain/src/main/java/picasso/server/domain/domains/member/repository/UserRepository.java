package picasso.server.domain.domains.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.member.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findBynickName(String nickname);

  Optional<User> findByEmail(String email);

  Optional<User> findByEmailAndPassword(String email, String password);
}

