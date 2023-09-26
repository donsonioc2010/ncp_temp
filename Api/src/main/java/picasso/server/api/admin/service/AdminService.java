package picasso.server.api.admin.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.admin.exception.AlreadyChangePictureException;
import picasso.server.api.admin.exception.NotActiveStatusException;
import picasso.server.api.admin.exception.NotFoundUserException;
import picasso.server.api.mail.service.SendMailService;
import picasso.server.common.exception.NotFoundException;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.repository.PictureRepository;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;
import picasso.server.domain.domains.user.type.UserRole;

import java.util.List;
import java.util.Optional;

import static picasso.server.domain.domains.picture.items.PictureStatus.AFTER_APPROVE;
import static picasso.server.domain.domains.picture.items.PictureStatus.BEFORE_APPROVE;
import static picasso.server.domain.domains.user.type.UserStatus.ACTIVE;
import static picasso.server.domain.domains.user.type.UserStatus.SUSPENSION;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AdminService {
    private final PictureRepository pictureRepository;
    private final UserRepository userRepository;
    private final SendMailService sendMailService;

    // TODO : 추후 Pagenation으로의 수정 필요함.
    @Transactional(readOnly = true)
    public List<Picture> findAllPicture() {
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
     *
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
                sendMailService.adminApproveMail(picture);
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
    @Transactional(readOnly = true)
    public List<User> findAllUser() {
        return userRepository.findByUserRole(UserRole.USER);
    }

    /**
     * 관리자가 멤버의 상태를 정지로 변환시킬 수 있는 기능
     *
     * @param userId
     */
    public void suspendUser(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (user.getUserStatus().equals(ACTIVE)) {
                user.setUserStatus(SUSPENSION);
                userRepository.save(user);
                log.info("SuspendUser Success >>> User ID : {}, Title : {}",
                        user.getId(), user.getEmail());
                return;

            } log.warn("SuspendUser Failure >>> User Id : {}, Title : {}",
                    user.getId(), user.getEmail());
            throw NotActiveStatusException.EXCEPTION;
        }
        throw NotFoundUserException.EXCEPTION;
    }


}



