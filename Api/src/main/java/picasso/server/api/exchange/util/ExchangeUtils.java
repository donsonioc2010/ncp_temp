package picasso.server.api.exchange.util;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.exchange.model.dto.ExchangeDTO;
import picasso.server.domain.domains.items.Exchange;
import picasso.server.domain.domains.repository.ExchangeRepository;

@RequiredArgsConstructor
public class ExchangeUtils {
  
  private final ExchangeRepository exchangeRepository;
  
  @Transactional
  public void save(Exchange exchange) {
    exchangeRepository.save(exchange);
  }
  
  
}
