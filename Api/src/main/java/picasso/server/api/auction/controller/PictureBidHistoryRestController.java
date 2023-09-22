package picasso.server.api.auction.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import picasso.server.api.auction.dto.request.PictureBiddingValidRequestDto;
import picasso.server.api.auction.service.PictureBidHistoryService;
import picasso.server.common.exception.NotLoginUserRestException;
import picasso.server.domain.domains.member.entity.User;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/bidding")
public class PictureBidHistoryRestController {

    private final PictureBidHistoryService pictureBidHistoryService;

    /**
     * 입찰자 본인이 입찰이 가능한지 확인하는 RestFul API
     *
     * @return
     */
    @PostMapping
    public ResponseEntity<Boolean> isAblePictureBidding(
            @Valid @RequestBody PictureBiddingValidRequestDto requestDto, HttpSession session
    ) {
        User user = (User) session.getAttribute("loginUser");
        if (user == null) {
            throw NotLoginUserRestException.EXCEPTION;
        }


        return ResponseEntity.ok(
                pictureBidHistoryService.isAbleBiddingPictureByUser(user, requestDto.getPictureId(), requestDto.getAmount())
        );
    }


}
