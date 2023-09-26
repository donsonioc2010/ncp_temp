package picasso.server.api.auction.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import picasso.server.api.auction.dto.request.PictureBiddingRequestDto;
import picasso.server.api.auction.dto.response.PictureAbleBidResponseDto;
import picasso.server.api.auction.service.PictureBidHistoryService;
import picasso.server.common.exception.NotLoginUserRestException;
import picasso.server.domain.domains.user.entity.User;

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
            @Valid @RequestBody PictureBiddingRequestDto requestDto, HttpSession session
    ) {
        return ResponseEntity.ok(
                pictureBidHistoryService.biddingProcess(session, isSessionHaveLoginUser(session), requestDto)
        );
    }

    @GetMapping("/{pictureId}")
    public ResponseEntity<PictureAbleBidResponseDto> isAblePictureBidding(
            @PathVariable Long pictureId, HttpSession session
    ) {
        return ResponseEntity.ok(
                pictureBidHistoryService.getSessionUserBiddingResult(
                        isSessionHaveLoginUser(session),
                        pictureId
                )
        );
    }

    private User isSessionHaveLoginUser(HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        if (user == null) {
            throw NotLoginUserRestException.EXCEPTION;
        }
        return user;
    }
}
