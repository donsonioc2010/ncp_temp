package picasso.server.domain.domains.payments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.payments.entity.PaymentHistory;

import java.util.Optional;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Long> {
  
  public Optional<PaymentHistory> findPaymentHistoryByMerchantUid(String merchantUid);
}
