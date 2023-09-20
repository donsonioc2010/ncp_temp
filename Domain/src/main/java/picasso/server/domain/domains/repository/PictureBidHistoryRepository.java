package picasso.server.domain.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.items.PictureBidHistory;

public interface PictureBidHistoryRepository extends JpaRepository<PictureBidHistory, Long> {
}
