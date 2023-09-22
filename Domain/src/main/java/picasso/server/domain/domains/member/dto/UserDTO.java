package picasso.server.domain.domains.member.dto;
import picasso.server.domain.domains.member.type.LoginType;
import picasso.server.domain.domains.member.type.UserRole;
import picasso.server.domain.domains.member.type.UserStatus;
import java.time.LocalDateTime;

public class UserDTO {

  private Long userId;
  private String email;
  private String password;
  private String nickname;
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
