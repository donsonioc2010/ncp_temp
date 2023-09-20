package picasso.server.domain.domains.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.member.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
//  Optional<User> findByNickname(String nickname);
//
//  Optional<User> findByEmail(String email);
//
//  Optional<User> findByEmailAndPassword(String email, String password);
}

