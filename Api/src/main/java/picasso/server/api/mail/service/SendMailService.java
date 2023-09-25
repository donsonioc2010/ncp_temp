package picasso.server.api.mail.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.common.mail.SendMailUtil;
import picasso.server.domain.domains.items.Picture;

/**
 * 모든 메일 발송에 대한 기능은 해당 Service에서 담당하여 발송합니다
 * 해당 기능은 모두 '비동기'로 진행해야 한다. (실행 성공 실패 결과가 중요하지 않기 떄문)
 *
 * 또한 모두 'Repository는 읽기작업만 진행한다.'
 */
@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SendMailService {
    private final SendMailUtil sendMailUtil;

    /**
     * 등록한 미술품 경매가 관리자 승인이 이뤄진 알림
     * @param picture
     */
    public void adminApproveMail(Picture picture) {

    }

    /**
     * 경매 새로운 입찰이 발생하는 경우 경매 물품 등록자, 입찰자한테 메일을 발송하는 기능
     * @param picture
     */
    public void newBidMail(Picture picture) {

    }

    /**
     * 등록한 미술품이 경매를 시작했다는 알림을 물품 등록자한테 발송
     * @param picture
     */
    public void startBiddingMail(Picture picture) {

    }

    /**
     * 등록한 미술품이 기간이 모두 종료되고, 낙찰자가 존해자여 낙찰자, 등록자한테 메일 발송
     * @param picture
     */
    public void pictureSuccessBidMail(Picture picture) {

    }

    /**
     * 등록한 미술품이 관리자 승인이 이뤄지지 않아 유찰되었다는 알림 메일 발송
     * @param picture
     */
    public void pictureRejectMailWithNotApproveAdmin(Picture picture) {

    }

    /**
     * 등록한 미술품이 기간이 모두 종료되어 유찰되었다는 알림 메일 발송
     * @param picture
     */
    public void pictureRejectMailWithFinishDate(Picture picture) {

    }


}
