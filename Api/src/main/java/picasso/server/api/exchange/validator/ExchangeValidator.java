package picasso.server.api.exchange.validator;

import lombok.RequiredArgsConstructor;
import picasso.server.common.annotation.Validator;
import picasso.server.domain.domains.items.Exchange;
import picasso.server.domain.domains.repository.ExchangeRepository;

@Validator
@RequiredArgsConstructor
public class ExchangeValidator {
  
  private final ExchangeRepository exchangeRepository;

  public boolean isExchangeValid(Exchange exchange) {
    return true;
  }
}
