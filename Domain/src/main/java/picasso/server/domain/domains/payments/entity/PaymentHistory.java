package picasso.server.domain.domains.payments.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import picasso.server.domain.domains.payments.items.PGName;

@Entity
@Getter
@Table(name = "tbl_payment_history")
@NoArgsConstructor
public class PaymentHistory {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Enumerated(EnumType.STRING)
  private PGName pgName;
  
  @NotNull
  private String productName;
  
  @NotNull
  private String merchantUid;
  
  @NotNull
  private Long amount;
  
  @NotNull
  private Long userId;
  
  @Builder
  public PaymentHistory(PGName pgName, String productName, String merchantUid, Long amount, Long userId) {
    this.pgName = pgName;
    this.productName = productName;
    this.merchantUid = merchantUid;
    this.amount = amount;
    this.userId = userId;
  }
}
