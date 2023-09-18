package picasso.server.api.auction.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import picasso.server.common.util.DateStaticConstants;

import java.time.LocalDate;

/**
 * 9시에 경매 전 상태인 게시물들을 처리하는 스케쥴러
 */

@Slf4j
@Component
@EnableAsync
@RequiredArgsConstructor
public class StartAuctionScheduler {

    @Scheduled(cron = "0 0 9 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startAuction() {
        log.info("Starting Todays Auctions Open : TodayDate >>> {}", LocalDate.now());
        // TODO : 관리자 승인된 게시물 경매 시작 상태로 Status 변경 로직 추가

        // TODO : 관리자 승인이 되지 않은 게시물 유찰상태로 변경Status로직 추가 및 메일발송 로직 추가
    }
}
