package picasso.server.domain.domains.items;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Builder
public class Exchange {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Enumerated(EnumType.STRING)
  private PGName pgName;
  
  @Enumerated(EnumType.STRING)
  private PayMethod payMethod;
  
  @NotNull
  private String merchantUUID;
  
  @NotNull
  private String productName;
  
  @NotNull
  private int price;
  
  /**
   * TODO : User Entity 추가 시 작성 예정
   * UserName, UserEmail, UserId 들어갈 InfoVo
   */
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "exchange")
//  private UserInfo userInfo;
  
  @Builder
  public Exchange(
          PGName pgName,
          PayMethod payMethod,
          String merchantUUID,
          String productName,
          int price
          ) {
    this.pgName = pgName;
    this.payMethod = payMethod;
    this.merchantUUID = merchantUUID;
    this.productName = productName;
    this.price = price;
  }
}
