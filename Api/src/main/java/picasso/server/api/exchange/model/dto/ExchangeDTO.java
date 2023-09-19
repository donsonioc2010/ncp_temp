package picasso.server.api.exchange.model.dto;

import lombok.Builder;
import lombok.Getter;
import picasso.server.domain.domains.items.Exchange;
import picasso.server.domain.domains.items.PGName;
import picasso.server.domain.domains.items.PayMethod;

@Getter
@Builder
public class ExchangeDTO {
  
  private PGName pgName;
  private PayMethod payMethod;
  private String merchantUUID;
  private String productName;
  private int price;
  
//  TODO: User Entity 작성 시 추가 작성 예정
//  private String userName;
//  private String userEmail;
  
  public static ExchangeDTO of(Exchange exchange) {
    return ExchangeDTO.builder()
            .pgName(exchange.getPgName())
            .payMethod(exchange.getPayMethod())
            .merchantUUID(exchange.getMerchantUUID())
            .productName(exchange.getProductName())
            .price(exchange.getPrice())
            .build();
  }
  
}
