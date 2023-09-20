package picasso.server.domain.domains.member.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import picasso.server.domain.domains.member.type.LoginType;
import picasso.server.domain.domains.member.type.Role;
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
  private LoginType loginType;

  @Enumerated(EnumType.STRING)
  @NotNull
  private UserStatus userStatus;

  @Enumerated(EnumType.STRING)
  @NotNull
  private Role role;

  @NotNull
  private LocalDateTime createdAt;

  @NotNull
  private LocalDateTime updatedAt;

  @NotNull
  private LocalDateTime loginAt;
}
