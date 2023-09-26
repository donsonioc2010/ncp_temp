package picasso.server.api.auction.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class PictureBidHistoryAmountCreatedAtResponse {
    private String bidAmount;
    private String createdAt;
}
