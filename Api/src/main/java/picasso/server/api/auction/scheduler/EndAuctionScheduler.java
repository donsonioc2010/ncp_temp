package picasso.server.api.auction.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.auction.service.PictureService;
import picasso.server.api.mail.service.SendMailService;
import picasso.server.common.util.DateStaticConstants;
import picasso.server.domain.domains.picture.items.Picture;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static picasso.server.domain.domains.picture.items.PictureStatus.BIDDING;
import static picasso.server.domain.domains.picture.items.PictureStatus.REJECT;
import static picasso.server.domain.domains.picture.items.PictureStatus.SUCCESS_BID;

/**
 * 18시에 경매 전 상태인 게시물들을 처리하는 스케쥴러
 */

@Slf4j
@Component
@EnableAsync
@RequiredArgsConstructor
public class EndAuctionScheduler {
    private final PictureService pictureService;
    private final SendMailService sendMailService;

    @Transactional
    @Scheduled(cron = "0 0 18 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startAuction() {
        log.info("Today End Auctions Schedule Start Time  >>> {}", LocalDateTime.now());
        List<Picture> todayEndPictursList = pictureService.findPictureStatusByStatusAndBidEndDate(BIDDING, LocalDate.now());
        todayEndPictursList.forEach(
                picture -> {
                    if (picture.getBidHistory().isEmpty()) {
                        picture.setPictureStatus(REJECT);
                        sendMailService.pictureRejectMailWithFinishDate(picture);
                    } else {
                        picture.setPictureStatus(SUCCESS_BID);
                        sendMailService.pictureSuccessBidMail(picture);
                    }
                }
        );
        pictureService.saveAllPictureList(todayEndPictursList);
        log.info("Today End Auctions Schedule End Time  >>> {}", LocalDateTime.now());
    }

}
