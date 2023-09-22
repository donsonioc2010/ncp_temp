package picasso.server.api.admin.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.admin.exception.AlreadyChangePictureException;
import picasso.server.common.exception.NotFoundException;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.member.entity.User;
import picasso.server.domain.domains.member.repository.UserRepository;
import picasso.server.domain.domains.member.type.UserRole;
import picasso.server.domain.domains.repository.PictureRepository;

import java.util.List;
import java.util.Optional;

import static picasso.server.domain.domains.items.PictureStatus.AFTER_APPROVE;
import static picasso.server.domain.domains.items.PictureStatus.BEFORE_APPROVE;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AdminService {
    private final PictureRepository pictureRepository;
    private final UserRepository userRepository;

    // TODO : 추후 Pagenation으로의 수정 필요함.
    @Transactional(readOnly = true)
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }


    public Picture getBeforeApproveStatusPictureDetailById(Long id) {
        Optional<Picture> picture = pictureRepository
                .findByPictureIdAndPictureStatus(id, BEFORE_APPROVE);
        if (picture.isPresent()) {
            return picture.get();
        }
        throw NotFoundException.EXCEPTION;
    }


    /**
     * 관리자 승인전의 게시물을 관리자 승인 상태로 변경  하는 기능
     * @param pictureId
     */
    public void approvePicture(Long pictureId) {
        Optional<Picture> optionalPicture = pictureRepository.findById(pictureId);
        if (optionalPicture.isPresent()) {
            Picture picture = optionalPicture.get();
            if (picture.getPictureStatus().equals(BEFORE_APPROVE)) {
                picture.setPictureStatus(AFTER_APPROVE);
                pictureRepository.save(picture);
                log.info("ApprovePicture Success >>> Picture Id : {}, Title : {}",
                        picture.getPictureId(), picture.getPictureName());
                return;
            }
            log.warn("ApprovePicture Failure >>> Picture Id : {}, Title : {}",
                    picture.getPictureId(), picture.getPictureName());
            throw AlreadyChangePictureException.EXCEPTION;
        }
        log.error("ApprovePicture Failure : Fail Reason Is {} Id is Empty", pictureId);
        throw NotFoundException.EXCEPTION;
    }


    @Transactional(readOnly = true)
    public List<User> findAllAdmin() {
        return userRepository.findByUserRole(UserRole.ADMIN);
    }
}



