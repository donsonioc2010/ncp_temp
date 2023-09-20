package picasso.server.api.admin.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;
import picasso.server.domain.domains.repository.PictureRepository;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class AdminService {
    private final PictureRepository pictureRepository;


    public List<Picture> findAll() {

        return pictureRepository.findAll();
    }

    public Optional<Picture> findById(Long id)
    {
        return pictureRepository.findById(id);
    }

    public Optional<Picture> findBypictureName(String pictureName) {
        return pictureRepository.findBypictureName(pictureName);


    }

    public Picture findByStatus(PictureStatus pictureStatus) {
        return pictureRepository.findByPictureStatus(pictureStatus);
    }

    public void approvePicture(Long pictureId) {
        Optional<Picture> pictureOptional = pictureRepository.findById(pictureId);
        if (pictureOptional.isPresent()) {
            Picture picture = pictureOptional.get();
            picture.setPictureStatus(PictureStatus.AFTER_APPROVE);
            pictureRepository.save(picture);
        } else {
            throw new IllegalArgumentException(pictureId+ "회원의 요청은 승인대기상태가 아닙니다. ");
        }
    }
}