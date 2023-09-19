package picasso.server.domain.domains.member.entity;

import jakarta.persistence.*;
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
public class Token {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String access_token;

  @Column(nullable = false)
  private String refresh_token;

  @Column(nullable = false)
  private LocalDateTime created_at;
}
