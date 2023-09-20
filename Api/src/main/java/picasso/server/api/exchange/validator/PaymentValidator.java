package picasso.server.api.exchange.validator;

import lombok.RequiredArgsConstructor;
import picasso.server.common.annotation.Validator;
import picasso.server.common.exception.BaseException;
import picasso.server.common.exception.PaymentException;
import picasso.server.domain.domains.items.PaymentHistory;
import picasso.server.domain.domains.repository.PaymentHistoryRepository;

import java.util.Optional;

@Validator
@RequiredArgsConstructor
public class PaymentValidator {
  
  private final PaymentHistoryRepository paymentHistoryRepository;

  public void isPaymentExists(String merchantUid) throws PaymentException {
    paymentHistoryRepository.findPaymentHistoryByMerchantUid(merchantUid).orElseThrow();
  }
}
