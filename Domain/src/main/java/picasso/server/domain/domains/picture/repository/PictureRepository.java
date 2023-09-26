package picasso.server.domain.domains.picture.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.items.PictureStatus;
import picasso.server.domain.domains.user.entity.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long>{

    List<Picture> findAllByOrderByBidStartDateAsc();

    List<Picture> findAllByPictureStatusOrderByBidStartDateAsc(PictureStatus status);

    List<Picture> findAllByPictureStatusAndBidEndDate(PictureStatus searchStatus, LocalDate searchDate);

    List<Picture> findAllByPictureStatusAndBidStartDate(PictureStatus searchStatus, LocalDate searchDate);

    Page<Picture> findAllByPictureStatusOrderByBidStartDateAsc(PictureStatus status, Pageable pageable);

    Optional<Picture> findByPictureIdAndPictureStatus(Long id, PictureStatus status);
    
    List<Picture> findAllByPictureStatusAndUser(PictureStatus status, User user);
}
