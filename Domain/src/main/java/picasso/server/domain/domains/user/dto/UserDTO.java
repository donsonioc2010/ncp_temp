package picasso.server.domain.domains.user.dto;

import lombok.Getter;
import lombok.Setter;
import picasso.server.domain.domains.user.type.LoginType;
import picasso.server.domain.domains.user.type.UserRole;
import picasso.server.domain.domains.user.type.UserStatus;
import java.time.LocalDateTime;

@Getter
@Setter
public class UserDTO {

  private Long userId;
  private String email;
  private String password;
  private String nickName;
  private String profile;
  private Long point;
  private LoginType loginType;
  private UserStatus userStatus;
  private UserRole userRole;
  private LocalDateTime userCreatedAt;
  private LocalDateTime userUpdatedAt;
  private LocalDateTime loginAt;

  private Long tokenId;
  private String accessToken;
  private String refreshToken;
  private LocalDateTime tokenCreatedAt;

}
