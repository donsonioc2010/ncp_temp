package picasso.server.domain.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long>{

    List<Picture> findAllByOrderByBidStartDateAsc();

    List<Picture> findAllByPictureStatusOrderByBidStartDateAsc(PictureStatus status);

    List<Picture> findAllByPictureStatusAndBidEndDate(PictureStatus searchStatus, LocalDate searchDate);
    List<Picture> findAllByPictureStatusAndBidStartDate(PictureStatus searchStatus, LocalDate searchDate);

}
