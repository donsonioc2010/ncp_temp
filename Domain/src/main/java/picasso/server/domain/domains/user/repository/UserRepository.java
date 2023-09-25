package picasso.server.domain.domains.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.type.UserRole;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNickName(String nickname);

    List<User> findByUserRole(UserRole userRole);


    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

}

