package picasso.server.api.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MailTitleConstant {
    BIDDING("[Picasso] 경매품 시작 안내"),
    REJECT("[Picasso] 경매품 유찰 안내"),
    SUCCESS_BID("[Picasso] 경매품 낙찰 안내");

    private final String mailTitle;
}