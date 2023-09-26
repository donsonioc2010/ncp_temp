package picasso.server.domain.domains.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import picasso.server.domain.domains.dto.UserDTO;
import picasso.server.domain.domains.user.entity.User;

public interface MypageRepository extends JpaRepository <User, Long> {
  @Query("SELECT new picasso.server.domain.domains.dto.UserDTO(u.nickName, u.point, u.profile) FROM User u WHERE u.id = :userId")
  UserDTO findUserFieldsById(@Param("userId") Long userId);

}
