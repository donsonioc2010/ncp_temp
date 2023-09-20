package picasso.server.domain.domains.items;

public enum PictureStatus {
    // 승인 전, 승인 후, 경매 진행중, 유찰, 낙찰
    BEFORE_APPROVE, AFTER_APPROVE, BIDDING, REJECT, SUCCESS_BID;
}
