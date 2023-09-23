package picasso.server.domain.domains.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;

import java.util.List;
import java.util.Optional;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long>{

    List<Picture> findAllByOrderByBidStartDateAsc();

    List<Picture> findAllByPictureStatusOrderByBidStartDateAsc(PictureStatus status);

<<<<<<< HEAD

    Page<Picture> findAllByPictureStatusOrderByBidStartDateAsc(PictureStatus status, Pageable pageable);
//    Page<Picture> findAllByPictureStatusOrderByBidEndDateAsc(PictureStatus status, Pageable pageable);

=======
    Optional<Picture> findByPictureIdAndPictureStatus(Long id, PictureStatus status);
>>>>>>> dev
}
