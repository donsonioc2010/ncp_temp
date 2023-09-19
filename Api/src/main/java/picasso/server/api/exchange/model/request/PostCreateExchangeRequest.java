package picasso.server.api.exchange.model.request;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import picasso.server.api.exchange.model.dto.ExchangeDTO;

@Getter
@NoArgsConstructor
public class PostCreateExchangeRequest {

  // TODO: rsp에 들어오는 데이터들에서 필요한 것을 더 추가할 예정.
  
  @Valid
  private ExchangeDTO exchangeDTO;
}
