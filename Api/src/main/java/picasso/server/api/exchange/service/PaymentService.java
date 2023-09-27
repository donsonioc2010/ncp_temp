package picasso.server.api.exchange.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.exchange.model.request.PostCreatePaymentRequest;
import picasso.server.api.exchange.validator.PaymentValidator;
import picasso.server.domain.domains.payments.items.PGName;
import picasso.server.domain.domains.payments.entity.PaymentHistory;
import picasso.server.domain.domains.payments.repository.PaymentHistoryRepository;

@Service
@RequiredArgsConstructor
public class PaymentService {
  
  private final PaymentHistoryRepository paymentHistoryRepository;
  private final PaymentValidator paymentValidator;
  
  public void savePaymentHistory(PostCreatePaymentRequest request) {
    paymentValidator.isFailedPayment(request.getPayResult());
    paymentValidator.isPaymentExists(request.getMerchantUid());
    
    PaymentHistory payment = PaymentHistory.builder()
            .pgName(request.getPgProvider().equals("kakaopay") ? PGName.KAKAO : PGName.TOSS)
            .productName(request.getProductName())
            .merchantUid(request.getMerchantUid())
            .amount(request.getPaidAmount())
            .userId(request.getUserId())
            .build();
    
    paymentHistoryRepository.save(payment);
  }
}
