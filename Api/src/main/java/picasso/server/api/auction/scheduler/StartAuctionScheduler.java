package picasso.server.api.auction.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import picasso.server.api.auction.service.PictureService;
import picasso.server.common.mail.SendMailUtil;
import picasso.server.common.util.DateStaticConstants;
import picasso.server.domain.domains.items.Picture;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static picasso.server.api.mail.MailPathConstants.PICTURE_BIDDING_MAIL;
import static picasso.server.api.mail.MailPathConstants.PICTURE_REJECT_MAIL;
import static picasso.server.api.mail.MailTitleConstant.REJECT;
import static picasso.server.api.mail.MailTitleConstant.SUCCESS_BID;
import static picasso.server.domain.domains.items.PictureStatus.AFTER_APPROVE;
import static picasso.server.domain.domains.items.PictureStatus.BIDDING;

/**
 * 9시에 경매 전 상태인 게시물들을 처리하는 스케쥴러
 */

@Slf4j
@Component
@EnableAsync
@RequiredArgsConstructor
public class StartAuctionScheduler {
    private final PictureService pictureService;
    private final SendMailUtil sendMailUtil;

    @Scheduled(cron = "0 0 9 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startApprovePictureToBiddingAuction() {
        log.info("Start Todays Auctions Open Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
        pictureService
                .changePictureStatusByPictureStatusAndBidEndDate(AFTER_APPROVE, BIDDING, LocalDate.now())
                .forEach(this::sendBiddingMail);

        log.info("End Todays Auctions Open Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
    }


    @Scheduled(cron = "0 0 9 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startNotApprovePictureToRejectAuction() {
        log.info("Start Reject Picture Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
        pictureService
                .changePictureStatusByPictureStatusAndBidEndDate(AFTER_APPROVE, BIDDING, LocalDate.now())
                .forEach(this::sendRejectMail);
        log.info("End Todays Auctions Open Schedule Runtime : NowTime >>> {}", LocalDateTime.now());
    }

    private void sendBiddingMail(Picture picture) {
        // TODO :  메일 내용에 들어갈 Content, 사용자 ToUser 추가 필요

        Map<String, Object> content = new HashMap<>();
        sendMailUtil.sendMail(
                "", SUCCESS_BID.getMailTitle(), PICTURE_BIDDING_MAIL, content
        );
    }

    private void sendRejectMail(Picture picture) {
        // TODO :  메일 내용에 들어갈 Content, 사용자 ToUser 추가 필요]

        Map<String, Object> content = new HashMap<>();
        sendMailUtil.sendMail(
                "", REJECT.getMailTitle(), PICTURE_REJECT_MAIL, content
        );
    }

}
