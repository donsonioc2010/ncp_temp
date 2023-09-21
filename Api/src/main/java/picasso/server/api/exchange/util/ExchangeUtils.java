package picasso.server.api.exchange.util;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.domain.domains.items.PaymentHistory;
import picasso.server.domain.domains.repository.PaymentHistoryRepository;

@RequiredArgsConstructor
public class ExchangeUtils {
  
  private final PaymentHistoryRepository paymentHistoryRepository;
  
  @Transactional
  public void save(PaymentHistory paymentHistory) {
    paymentHistoryRepository.save(paymentHistory);
  }
  
  
}
