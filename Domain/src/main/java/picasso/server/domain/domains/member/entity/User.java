package picasso.server.domain.domains.member.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import picasso.server.domain.domains.member.type.LoginType;
import picasso.server.domain.domains.member.type.UserRole;
import picasso.server.domain.domains.member.type.UserStatus;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tbl_member")
@Getter
@Setter
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @NotNull
  private String email;

  @NotNull
  private String password;

  @NotNull
  private String nickName;

  @Column
  private String profile;

  @Column
  private Long point;

  @Enumerated(EnumType.STRING)
  @NotNull
  private LoginType loginType = LoginType.DEFAULT;

  @Enumerated(EnumType.STRING)
  @NotNull
  private UserStatus userStatus = UserStatus.NOT_ACTIVE;

  @Enumerated(EnumType.STRING)
  @NotNull
  private UserRole userRole = UserRole.USER;

  @NotNull
  private LocalDateTime createdAt = LocalDateTime.now();

  @NotNull
  private LocalDateTime updatedAt;

  @NotNull
  private LocalDateTime loginAt;
}
