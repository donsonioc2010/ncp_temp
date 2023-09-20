package picasso.server.api.auction.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import picasso.server.api.auction.service.PictureService;
import picasso.server.api.mail.MailTitleConstant;
import picasso.server.common.mail.SendMailUtil;
import picasso.server.common.util.DateStaticConstants;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

import static picasso.server.api.mail.MailPathConstants.PICTURE_REJECT_MAIL;
import static picasso.server.api.mail.MailPathConstants.PICTURE_SUCCESSBID_MAIL;
import static picasso.server.domain.domains.items.PictureStatus.SUCCESS_BID;

/**
 * 18시에 경매 전 상태인 게시물들을 처리하는 스케쥴러
 */

@Slf4j
@Component
@EnableAsync
@RequiredArgsConstructor
public class EndAuctionScheduler {
    private final PictureService pictureService;
    private final SendMailUtil sendMailUtil;

    @Scheduled(cron = "0 0 18 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startAuction() {
        log.info("Today End Auctions Schedule Start Time  >>> {}", LocalDateTime.now());
        List<Picture> todayEndPictursList =  pictureService.findPictureStatusByStatusAndBidEndDate(PictureStatus.BIDDING, LocalDate.now());
        todayEndPictursList.forEach(this::sendFinishBidMail);
        pictureService.saveAllPictureList(todayEndPictursList);
        log.info("Today End Auctions Schedule End Time  >>> {}", LocalDateTime.now());
    }
    private void sendFinishBidMail(Picture picture) {
        // TODO :  메일 내용에 들어갈 Content, 사용자 ToUser 추가 필요
        if(picture.getBidHistory().isEmpty()) {
            sendMailUtil.sendMail("", MailTitleConstant.REJECT.getMailTitle(), PICTURE_REJECT_MAIL, new HashMap<>());
            picture.setPictureStatus(PictureStatus.REJECT);
            return;
        }
        sendMailUtil.sendMail("", MailTitleConstant.SUCCESS_BID.getMailTitle(), PICTURE_SUCCESSBID_MAIL, new HashMap<>());
        picture.setPictureStatus(SUCCESS_BID);
    }

}
