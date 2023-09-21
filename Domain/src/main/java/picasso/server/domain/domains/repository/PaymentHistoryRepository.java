package picasso.server.domain.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.items.PaymentHistory;

import java.util.Optional;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Long> {
  
  public Optional<PaymentHistory> findPaymentHistoryByMerchantUid(String merchantUid);
}
