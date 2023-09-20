package picasso.server.api.exchange.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostCreateExchangeRequest {
  private Boolean payResult;
  private String buyerName;
  private String buyerEmail;
  private String merchantUid;
  private String productName;
  private String pgProvider;
  private int paidAmount;
}
