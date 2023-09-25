package picasso.server.api.auction.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import picasso.server.common.exception.NotFoundRestException;
import picasso.server.common.exception.NotLoginUserRestException;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.items.PictureBidHistory;
import picasso.server.domain.domains.picture.repository.PictureRepository;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;
import picasso.server.domain.domains.picture.repository.PictureBidHistoryRepository;

import java.util.Optional;


@Slf4j
@RequiredArgsConstructor
@Service
public class PictureBidHistoryService {
    private final UserRepository userRepository;
    private final PictureRepository pictureRepository;
    private final PictureBidHistoryRepository pictureBidHistoryRepository;

    /**
     * 입찰 프로세스
     * @param user
     * @param pictureId
     * @param amount
     * @return
     */
    public boolean biddingProcess(User user, Long pictureId, Long amount) {
        User findUser = userRepository.findById(user.getId()).orElseThrow(() -> NotLoginUserRestException.EXCEPTION);
        Picture findPicture = pictureRepository.findById(pictureId).orElseThrow(() -> NotFoundRestException.EXCEPTION);
        Optional<PictureBidHistory> optionalTopHistory = pictureBidHistoryRepository.findTopByPictureOrderByBidAmountDesc(findPicture);

        //아무도 입찰 신청을 하지 않은 경우 또는 요청한 사용자가 입찰 신청한경우 , DB에 저장
        if (optionalTopHistory.isEmpty() || isAbleBiddingPictureByUser(user, findPicture, optionalTopHistory.get(), amount)) {
            PictureBidHistory newBidHistory = PictureBidHistory.builder()
                    .picture(findPicture)
                    .user(findUser)
                    .bidAmount(amount)
                    .build();
            findPicture.addBidHistory(newBidHistory);
            pictureRepository.save(findPicture);
            return true;
        }
        return false;
    }

    /**
     * 로그인한 사용자가 입찰 가능 여부를 확인하는 로직
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
}
