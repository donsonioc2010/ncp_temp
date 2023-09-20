package picasso.server.domain.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.items.PaymentHistory;

public interface ExchangeRepository extends JpaRepository<PaymentHistory, Long> {

}
