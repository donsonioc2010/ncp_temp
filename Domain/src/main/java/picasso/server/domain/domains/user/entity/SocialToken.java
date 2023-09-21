package picasso.server.domain.domains.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@Table(name = "t_token")
@NoArgsConstructor
public class SocialToken {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @OneToOne
  private User user;

  @NotNull
  @Column
  private String accessToken;

  @NotNull
  @Column
  private String refreshToken;

  @NotNull
  @Column
  private LocalDateTime createdAt = LocalDateTime.now();
}
