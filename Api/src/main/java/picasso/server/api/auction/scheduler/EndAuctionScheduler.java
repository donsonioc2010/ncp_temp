package picasso.server.api.auction.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import picasso.server.common.util.DateStaticConstants;

import java.time.LocalDate;

/**
 * 18시에 경매 전 상태인 게시물들을 처리하는 스케쥴러
 */

@Slf4j
@Component
@EnableAsync
@RequiredArgsConstructor
public class EndAuctionScheduler {
    @Scheduled(cron = "0 0 18 * * *", zone = DateStaticConstants.ZONE_SEOUL)
    public void startAuction() {
        log.info("End Todays Auctions Open : TodayDate >>> {}", LocalDate.now());

        // TODO : 입찰자가 존재하는 경우 입찰 안내 메일 발송 로직 추가 및 상태값 변경

        // TODO : 입찰자가 존재하지 않는 경우 유찰 안내 메일 발송 로직 추가 및 상태값 변경
    }
}
