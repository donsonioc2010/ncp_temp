package picasso.server.domain.domains.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

  List<User> findAll();
  Optional<User> findByEmailAndPassword(String email, String password);

  Optional<User> findByEmail(String email);
}
