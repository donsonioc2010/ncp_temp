package picasso.server.domain.domains.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.member.entity.User;
import picasso.server.domain.domains.member.type.UserRole;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUserRole(UserRole userRole);


    Optional<User> findByNickName(String nickname);

  Optional<User> findByEmail(String email);

  Optional<User> findByEmailAndPassword(String email, String password);
}

