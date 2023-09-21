package picasso.server.api.exchange.validator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import picasso.server.common.annotation.Validator;
import picasso.server.common.exception.PaymentAlreadyExistsException;
import picasso.server.common.exception.PaymentFailedException;
import picasso.server.domain.domains.repository.PaymentHistoryRepository;

@Slf4j
@Validator
@RequiredArgsConstructor
public class PaymentValidator {
  
  private final PaymentHistoryRepository paymentHistoryRepository;

  public void isPaymentExists(String merchantUid) {
    paymentHistoryRepository.findPaymentHistoryByMerchantUid(merchantUid).ifPresent(
      paymentHistory -> {
        throw PaymentAlreadyExistsException.EXCEPTION;}
    );
  }
  
  public void isFailedPayment(Boolean payResult) {
    if (!payResult) {
      throw PaymentFailedException.EXCEPTION;
    }
  }
}
