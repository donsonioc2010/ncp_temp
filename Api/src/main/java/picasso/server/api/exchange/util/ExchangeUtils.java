package picasso.server.api.exchange.util;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.domain.domains.items.PaymentHistory;
import picasso.server.domain.domains.repository.ExchangeRepository;

@RequiredArgsConstructor
public class ExchangeUtils {
  
  private final ExchangeRepository exchangeRepository;
  
  @Transactional
  public void save(PaymentHistory paymentHistory) {
    exchangeRepository.save(paymentHistory);
  }
  
  
}
