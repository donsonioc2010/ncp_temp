package picasso.server.api.auction.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.repository.PictureRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PictureService {

    private final PictureRepository pictureRepository;

    //아이템등록
    public Picture saveItem(Picture picture) {
        Picture savedPicture = pictureRepository.save(picture);
        return savedPicture;
    }

    public List<Picture> findItem() {
        return pictureRepository.findAll();
    }

    public Optional<Picture> findOne(Long id) {
        return pictureRepository.findById(id);
    }

}
