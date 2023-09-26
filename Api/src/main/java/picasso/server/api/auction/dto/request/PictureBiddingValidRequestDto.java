package picasso.server.api.auction.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

/**
 * 입찰시, 입찰 가능여부 확인을 위한 RequestDTO
 */
@Data
public class PictureBiddingValidRequestDto {
    @PositiveOrZero
    @NotNull(message = "PictureId는 필수 입력을 하셔야 합니다.")
    private Long pictureId;

    @PositiveOrZero
    @NotNull(message = "경매 금액이 입력되지 않았습니다.")
    private Long amount;
}
