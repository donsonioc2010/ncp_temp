package picasso.server.domain.domains.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import picasso.server.domain.domains.user.type.LoginType;
import picasso.server.domain.domains.user.type.UserRole;
import picasso.server.domain.domains.user.type.UserStatus;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;
import static picasso.server.domain.domains.user.type.LoginType.DEFAULT;
import static picasso.server.domain.domains.user.type.UserRole.USER;
import static picasso.server.domain.domains.user.type.UserStatus.NOT_ACTIVE;

@Entity
@Table(name = "tbl_user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @OneToOne(mappedBy = "user")
  private SocialToken tokens;

  @NotNull
  @Column(unique = true)
  private String email;

  @NotNull
  @Column
  private String password;

  @NotNull
  @Column(unique = true)
  private String nickName;

  @NotNull
  @Column
  private String profile;

  @Column
  @Builder.Default
  private Long point = 0L;

  @Enumerated(EnumType.STRING)
  @Builder.Default
  @Column
  private LoginType loginType = DEFAULT;

  @Enumerated(EnumType.STRING)
  @Builder.Default
  @Column
  private UserStatus userStatus = NOT_ACTIVE;

  @Enumerated(EnumType.STRING)
  @Builder.Default
  @Column
  private UserRole userRole = USER;

  @NotNull
  @Builder.Default
  @Column
  private LocalDateTime createdAt = LocalDateTime.now();

  @NotNull
  @Builder.Default
  @Column
  private LocalDateTime updatedAt = LocalDateTime.now();

  @Builder.Default
  @NotNull
  private LocalDateTime loginAt = LocalDateTime.now();
  
  public void updatePoint(Long point) {
    this.point += point;
  }
}
