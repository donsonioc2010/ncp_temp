package picasso.server.domain.domains.dto;
import lombok.Getter;
import lombok.Setter;
import picasso.server.domain.domains.user.type.LoginType;
import picasso.server.domain.domains.user.type.UserRole;
import picasso.server.domain.domains.user.type.UserStatus;
import java.time.LocalDateTime;

@Getter
@Setter
public class UserDTO {

  private Long memberId;
  private String email;
  private String password;
  private String nickName;
  private String profile;
  private Long point;
  private LoginType loginType;
  private UserStatus userStatus;
  private UserRole userRole;
  private LocalDateTime memberCreatedAt;
  private LocalDateTime memberUpdatedAt;
  private LocalDateTime loginAt;

  private Long tokenId;
  private String accessToken;
  private String refreshToken;
  private LocalDateTime tokenCreatedAt;

}
