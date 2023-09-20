package picasso.server.api.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;
import picasso.server.domain.domains.repository.PictureRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdminService {
    private final PictureRepository pictureRepository;

    public AdminService(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }

    public Optional<Picture> findById(Long id) {
        return pictureRepository.findById(id);
    }

    public Optional<Picture> findByPictureName(String pictureName) {
        return pictureRepository.findBypictureName(pictureName);
    }

    public void approvePicture(Long pictureId) {
        Picture picture = pictureRepository.findById(pictureId).orElse(null);
        if (picture != null) {
            PictureStatus currentStatus = picture.getPictureStatus();
            if (currentStatus == PictureStatus.BEFORE_APPROVE) {
                // 이미지를 승인 상태로 변경
                picture.setPictureStatus(PictureStatus.AFTER_APPROVE);
                pictureRepository.save(picture);
            } else {
                // 이미 승인된 경우에는 승인할 수 없음을 처리하거나 예외를 던질 수 있음
                throw new IllegalStateException("이미 승인된 요청입니다.");
            }
        } else {
            throw new IllegalArgumentException("유효하지 않은 요청입니다.");
        }
    }
}

