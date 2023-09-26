package picasso.server.api.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MailTitleConstant {
    ADMIN_APPROVE("[Picasso] 경매품 관리자 승인 안내"),
    BIDDING("[Picasso] 경매품 시작 안내"),
    NEW_BID("[Picasso] 입찰 안내"),
    REJECT("[Picasso] 경매품 유찰 안내"),
    SUCCESS_BID("[Picasso] 경매품 낙찰 안내");

    private final String mailTitle;
}