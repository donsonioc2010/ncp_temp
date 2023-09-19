package picasso.server.api.member.dto;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

  private Long id;
  private Long userId;
  private String email;
  private String password;
  private String nickname;
  private String profile;
  private Long point;
  private String loginType;
  private String status;
  private String role;
  private Date createdAt;
  private Date updatedAt;
  private Date loginAt;
  private String accessToken;
  private String refreshToken;

  // 필요한 경우 생성자, 변환 메서드 등을 여기에 추가할 수 있습니다.
}
