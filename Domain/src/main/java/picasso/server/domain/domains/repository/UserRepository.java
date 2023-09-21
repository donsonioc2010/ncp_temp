package picasso.server.domain.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.user.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);
  List<User> findAll();
}

