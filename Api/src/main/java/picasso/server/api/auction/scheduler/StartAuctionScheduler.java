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

import java.time.LocalDate;
import java.time.LocalDateTime;

import static picasso.server.domain.domains.picture.items.PictureStatus.AFTER_APPROVE;
import static picasso.server.domain.domains.picture.items.PictureStatus.BEFORE_APPROVE;
import static picasso.server.domain.domains.picture.items.PictureStatus.BIDDING;

/**
 * 9시에 경매 전 상태인 게시물들을 처리하는 스케쥴러
 */

@Slf4j
@Component
@EnableAsync
@RequiredArgsConstructor
public class StartAuctionScheduler {
    private final PictureService pictureService;
    private final SendMailService sendMailService;

    @Transactional
    @Scheduled(cron = "0 0 9 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startApprovePictureToBiddingAuction() {
        log.info("Start Todays Auctions Open Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
        pictureService
                .changePictureStatusByPictureStatusAndBidStartDate(AFTER_APPROVE, BIDDING, LocalDate.now())
                .forEach(sendMailService::startBiddingMail);
        log.info("End Todays Auctions Open Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
    }


    @Transactional
    @Scheduled(cron = "0 0 9 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startNotApprovePictureToRejectAuction() {
        log.info("Start Reject Picture Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
        pictureService
                .changePictureStatusByPictureStatusAndBidStartDate(BEFORE_APPROVE, BIDDING, LocalDate.now())
                .forEach(sendMailService::pictureRejectMailWithNotApproveAdmin);
        log.info("End Todays Auctions Open Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
    }
}
