package picasso.server.api.auction.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PictureAbleBidResponseDto {
    private boolean result;
    private String message;
}
