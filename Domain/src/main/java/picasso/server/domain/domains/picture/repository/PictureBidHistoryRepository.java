package picasso.server.domain.domains.picture.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.items.PictureBidHistory;
import picasso.server.domain.domains.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface PictureBidHistoryRepository extends JpaRepository<PictureBidHistory, Long> {
    /**
     * 그림의 히스토리를 최근 입찰한 한건에 대해서 Optional로 반환한다.
     * @param picture
     * @return
     */
    Optional<PictureBidHistory> findTopByPictureOrderByBidAmountDesc(Picture picture);

    /**
     * 그림 한개의 모든 히스토리를 최근 입찰한 순서대로 반환
     * @param picture
     * @return
     */
    List<PictureBidHistory> findByPictureOrderByCreatedAtDesc(Picture picture);

    /**
     * 가장 높은 입찰 금액 리스트 페이지네이션
     * @param pageable
     * @return
     */
    Page<PictureBidHistory> findAllByOrderByBidAmountDesc(Pageable pageable);

    /**
     * 사용자가 입찰한 모든 내역을 최근 입찰한 순서대로 조회
     * @param user
     * @return
     */
    List<PictureBidHistory> findByUserOrderByCreatedAtDesc(User user);

    List<PictureBidHistory> findByPictureOrderByBidAmountDesc(Picture picture);
}
