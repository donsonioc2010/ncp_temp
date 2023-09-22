package picasso.server.api.auction.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import picasso.server.common.exception.NotFoundRestException;
import picasso.server.common.exception.NotLoginUserRestException;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureBidHistory;
import picasso.server.domain.domains.user.entity.User;
import picasso.server.domain.domains.user.repository.UserRepository;
import picasso.server.domain.domains.repository.PictureBidHistoryRepository;
import picasso.server.domain.domains.repository.PictureRepository;

import java.util.Optional;


@Slf4j
@RequiredArgsConstructor
@Service
public class PictureBidHistoryService {
    private final UserRepository userRepository;
    private final PictureRepository pictureRepository;
    private final PictureBidHistoryRepository pictureBidHistoryRepository;


    /**
     * 로그인한 사용자가 입찰 가능 여부를 확인하는 로직
     * @param user
     * @param pictureId
     * @param amount
     * @return
     */
    public boolean isAbleBiddingPictureByUser(User user, Long pictureId, Long amount) {
        User findUser = userRepository.findById(user.getId()).orElseThrow(()->NotLoginUserRestException.EXCEPTION);
        Picture findPicture = pictureRepository.findById(pictureId).orElseThrow(() -> NotFoundRestException.EXCEPTION);

        Optional<PictureBidHistory> optionalTopHistory = pictureBidHistoryRepository.findTopByPictureOrderByBidAmountDesc(findPicture);

        if(optionalTopHistory.isEmpty()) {
            return true;
        }
        PictureBidHistory topHistory = optionalTopHistory.get();
        // 사용자가 최종 입찰자가 아니거나,
        return !topHistory.getUser().equals(user) && amount <= topHistory.getBidAmount() + findPicture.getIncrementAmount();
    }


}
