package picasso.server.domain.domains.user.dto;

import lombok.Builder;
import lombok.Data;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.type.LoginType;
import picasso.server.domain.domains.user.type.UserRole;
import picasso.server.domain.domains.user.type.UserStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDto {

  private Long id;
  private String email;
  private String nickname;
  private String profile;
  private Long point;
  private LoginType loginType;
  private UserStatus userstatus;
  private UserRole role;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime loginAt;


  public static User userEntity(UserDto requestUserDto) {
    return User.builder()
            .email(requestUserDto.getEmail())
            .nickName(requestUserDto.getNickname())
            .profile(requestUserDto.getProfile())
            .point(requestUserDto.getPoint())
            .loginType(requestUserDto.getLoginType())
            .userStatus(requestUserDto.getUserstatus())
            .userRole(requestUserDto.getRole())
            .createdAt(requestUserDto.getCreatedAt())
            .updatedAt(requestUserDto.getUpdatedAt())
            .loginAt(requestUserDto.getLoginAt())
            .build();
  }
}
