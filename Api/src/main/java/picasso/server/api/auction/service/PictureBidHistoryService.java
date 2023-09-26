package picasso.server.api.auction.service;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.auction.dto.request.PictureBiddingRequestDto;
import picasso.server.api.auction.dto.response.PictureAbleBidResponseDto;
import picasso.server.common.exception.NotFoundRestException;
import picasso.server.common.exception.NotLoginUserRestException;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.items.PictureBidHistory;
import picasso.server.domain.domains.picture.items.PictureStatus;
import picasso.server.domain.domains.picture.repository.PictureBidHistoryRepository;
import picasso.server.domain.domains.picture.repository.PictureRepository;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class PictureBidHistoryService {
    private final UserRepository userRepository;
    private final PictureRepository pictureRepository;
    private final PictureBidHistoryRepository pictureBidHistoryRepository;

    public List<PictureBidHistory> getBidAmountListDescByPicture(Picture picture) {
        return pictureBidHistoryRepository.findByPictureOrderByBidAmountDesc(picture);
    }

    public PictureBidHistory getTopBidAmountByPicture(Picture picture) {
        return pictureBidHistoryRepository.findTopByPictureOrderByBidAmountDesc(picture).orElse(null);
    }

    /**
     * 입찰 프로세스
     *
     * @param user
     * @param pictureId
     * @param amount
     * @return
     */
    @Transactional
    public boolean biddingProcess(HttpSession session, User user, PictureBiddingRequestDto requestDto) {
        User findUser = userRepository.findById(user.getId()).orElseThrow(() -> NotLoginUserRestException.EXCEPTION);
        Picture findPicture = pictureRepository.findById(requestDto.getPictureId()).orElseThrow(() -> NotFoundRestException.EXCEPTION);
        pictureBidHistoryRepository.findTopByPictureOrderByBidAmountDesc(findPicture)
                .ifPresent(topHistory -> topHistory.getUser().updatePoint(topHistory.getBidAmount()));
        pictureBidHistoryRepository.save(
                PictureBidHistory.builder()
                        .picture(findPicture)
                        .user(findUser)
                        .bidAmount(requestDto.getAmount())
                        .build()
        );

        findUser.minusPoint(requestDto.getAmount());
        userRepository.save(findUser);
        session.setAttribute("loginUser", findUser);
        return true;
    }

    /**
     * 로그인한 사용자가 입찰 가능 여부를 확인하는 로직
     *
     * @param user
     * @param picture
     * @param topHistory
     * @param amount
     * @return
     */
    private boolean isAbleBiddingPictureByUser(User user, Picture picture, PictureBidHistory topHistory, Long amount) {

        // 사용자가 최종 입찰자가 아니거나 또는
        return !topHistory.getUser().equals(user) && amount <= topHistory.getBidAmount() + picture.getIncrementAmount();
    }

    /**
     * 경매 입찰을 진행한 사용자가 입찰이 가능한지를 검증한다.
     *
     * @param sessionHaveLoginUser
     * @param pictureId
     * @return
     */
    @Transactional
    public PictureAbleBidResponseDto getSessionUserBiddingResult(User sessionHaveLoginUser, Long pictureId) {
        Picture findPicture = pictureRepository.findById(pictureId).orElseThrow(() -> NotFoundRestException.EXCEPTION);
        Optional<PictureBidHistory> optionalTopHistory = pictureBidHistoryRepository.findTopByPictureOrderByBidAmountDesc(findPicture);
        if (sessionHaveLoginUser.getEmail().equals(findPicture.getUser().getEmail())) {
            return PictureAbleBidResponseDto.builder()
                    .result(false)
                    .message("경매품 등록자는 입찰이 불가합니다.")
                    .build();
        }

        if (optionalTopHistory.isPresent() && optionalTopHistory.get().getUser().getEmail().equals(sessionHaveLoginUser.getEmail())) {
            return PictureAbleBidResponseDto.builder()
                    .result(false)
                    .message("가장 최근 입찰자 입니다.")
                    .build();
        }

        return PictureAbleBidResponseDto.builder()
                .result(true)
                .build();
    }

    public List<PictureBidHistory> retrieveMyBidHistoryList(User user) {
        return pictureBidHistoryRepository.findAllByUserOrderByCreatedAt(user);
    }

    public List<Picture> retrieveMyPictureList(User user, PictureStatus pictureStatus) {
        return pictureRepository.findAllByPictureStatusAndUser(pictureStatus, user);
    }
}
