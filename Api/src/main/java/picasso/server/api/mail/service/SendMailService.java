package picasso.server.api.mail.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.common.exception.NotFoundException;
import picasso.server.common.mail.SendMailUtil;
import picasso.server.common.properties.PicassoProperties;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.items.PictureBidHistory;
import picasso.server.domain.domains.picture.repository.PictureBidHistoryRepository;

import java.util.HashMap;

import static picasso.server.api.mail.MailPathConstants.PICTURE_APPROVE_MAIL;
import static picasso.server.api.mail.MailPathConstants.PICTURE_BIDDING_MAIL;
import static picasso.server.api.mail.MailPathConstants.PICTURE_NOT_APPROVE_REJECT_MAIL;
import static picasso.server.api.mail.MailPathConstants.PICTURE_NO_BID_REJECT_MAIL;
import static picasso.server.api.mail.MailPathConstants.PICTURE_SUCCESSBID_MAIL;
import static picasso.server.api.mail.MailTitleConstant.BIDDING;
import static picasso.server.api.mail.MailTitleConstant.REJECT;
import static picasso.server.api.mail.MailTitleConstant.SUCCESS_BID;

/**
 * 모든 메일 발송에 대한 기능은 해당 Service에서 담당하여 발송합니다
 * 해당 기능은 모두 '비동기'로 진행해야 한다. (실행 성공 실패 결과가 중요하지 않기 떄문)
 * <p>
 * 또한 모두 'Repository는 읽기작업만 진행한다.'
 */
@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SendMailService {
    private final PictureBidHistoryRepository pictureBidHistoryRepository;
    private final SendMailUtil sendMailUtil;
    private final PicassoProperties picassoProperties;

    /**
     * 등록한 미술품 경매가 관리자 승인이 이뤄진 알림
     *
     * @param picture
     */
    @Async
    public void adminApproveMail(Picture picture) {
        sendMailUtil.sendMail(
                picture.getUser().getEmail(),
                REJECT.getMailTitle(),
                PICTURE_APPROVE_MAIL,
                new HashMap<>() {{
                    put("pictureName", picture.getPictureName());
                    put("startBidDate", picture.getBidStartDate().toString());
                    put("link", picassoProperties.getDomain() + "pictures/" + picture.getPictureId());
                }}
        );
    }

    /**
     * 등록한 미술품이 경매를 시작했다는 알림을 물품 등록자한테 발송
     *
     * @param picture
     */
    @Async
    public void startBiddingMail(Picture picture) {
        sendMailUtil.sendMail(
                picture.getUser().getEmail(),
                BIDDING.getMailTitle(),
                PICTURE_BIDDING_MAIL,
                new HashMap<>() {{
                    put("pictureName", picture.getPictureName());
                    put("bidEndDate", picture.getBidEndDate().toString());
                    put("link", picassoProperties.getDomain() + "pictures/" + picture.getPictureId());
                }}
        );
    }

    /**
     * 등록한 미술품이 기간이 모두 종료되고, 낙찰자가 존해자여 낙찰자, 등록자한테 메일 발송
     *
     * @param picture
     */
    @Async
    public void pictureSuccessBidMail(Picture picture) {
        PictureBidHistory topHistory = pictureBidHistoryRepository.findTopByPictureOrderByBidAmountDesc(picture)
                .orElseThrow(() -> NotFoundException.EXCEPTION);

        //등록자 한테  한테 메일 발송
        sendMailUtil.sendMail(
                picture.getUser().getEmail(),
                SUCCESS_BID.getMailTitle(),
                PICTURE_SUCCESSBID_MAIL,
                new HashMap<>() {{
                    put("pictureName", picture.getPictureName());
                    put("bidAmount", topHistory.getBidAmount());
                    put("link", picassoProperties.getDomain() + "pictures/" + picture.getPictureId());
                }}
        );

        // 낙찰자한테 메일 발송
        sendMailUtil.sendMail(
                topHistory.getUser().getEmail(),
                SUCCESS_BID.getMailTitle(),
                PICTURE_SUCCESSBID_MAIL,
                new HashMap<>() {{
                    put("pictureName", picture.getPictureName());
                    put("bidAmount", topHistory.getBidAmount());
                    put("link", picassoProperties.getDomain() + "pictures/" + picture.getPictureId());
                }}
        );
    }

    /**
     * 등록한 미술품이 관리자 승인이 이뤄지지 않아 유찰되었다는 알림 메일 발송
     *
     * @param picture
     */
    @Async
    public void pictureRejectMailWithNotApproveAdmin(Picture picture) {
        sendMailUtil.sendMail(
                picture.getUser().getEmail(),
                REJECT.getMailTitle(),
                PICTURE_NOT_APPROVE_REJECT_MAIL,
                new HashMap<>() {{
                    put("pictureName", picture.getPictureName());
                    put("link", picassoProperties.getDomain() + "pictures/" + picture.getPictureId());
                }}
        );
    }

    /**
     * 등록한 미술품이 기간이 모두 종료되어 유찰되었다는 알림 메일 발송
     *
     * @param picture
     */
    @Async
    public void pictureRejectMailWithFinishDate(Picture picture) {
        sendMailUtil.sendMail(
                picture.getUser().getEmail(),
                REJECT.getMailTitle(),
                PICTURE_NO_BID_REJECT_MAIL,
                new HashMap<>() {{
                    put("pictureName", picture.getPictureName());
                    put("link", picassoProperties.getDomain() + "pictures/" + picture.getPictureId());
                }}
        );
    }
}
