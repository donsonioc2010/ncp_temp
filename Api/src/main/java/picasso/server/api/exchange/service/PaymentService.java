package picasso.server.api.exchange.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.api.exchange.model.request.PostCreatePaymentRequest;
import picasso.server.api.exchange.validator.PaymentValidator;
import picasso.server.domain.domains.items.PGName;
import picasso.server.domain.domains.items.PaymentHistory;
import picasso.server.domain.domains.repository.PaymentHistoryRepository;

@Service
@RequiredArgsConstructor
public class PaymentService {
  
  private final PaymentHistoryRepository paymentHistoryRepository;
  private final PaymentValidator paymentValidator;
  
  public void savePaymentHistory(PostCreatePaymentRequest request) {
    PaymentHistory payment = PaymentHistory.builder()
            .pgName(PGName.valueOf(request.getPgProvider()))
            .productName(request.getProductName())
            .merchantUid(request.getMerchantUid())
            .amount(request.getPaidAmount())
            .userId(request.getUserId())
            .build();
    
    paymentValidator.isPaymentExists(request.getMerchantUid());
    paymentHistoryRepository.save(payment);
  }
}
