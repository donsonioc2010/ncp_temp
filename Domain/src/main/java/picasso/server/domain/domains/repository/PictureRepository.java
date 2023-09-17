package picasso.server.domain.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import picasso.server.domain.domains.items.Picture;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long>{

}
