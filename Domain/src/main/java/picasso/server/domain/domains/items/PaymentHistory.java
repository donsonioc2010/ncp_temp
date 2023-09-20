package picasso.server.domain.domains.items;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class PaymentHistory {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Enumerated(EnumType.STRING)
  private PGName pgName;
  
  @Enumerated(EnumType.STRING)
  private PayMethod payMethod;
  
  @NotNull
  private String productName;
  
  @NotNull
  private int amount;
  
  @NotNull
  private Long userId;
}
