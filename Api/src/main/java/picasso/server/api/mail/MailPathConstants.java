package picasso.server.api.mail;

public class MailPathConstants {
    public static final String SAMPLE_MAIL = "mail/sample";

    // 관리자 미승인으로 인한 유찰메일 안내
    public static final String PICTURE_NOT_APPROVE_REJECT_MAIL = "mail/not-approve-reject-mail";

    // 입찰자가 없음으로 인한 유찰메일 안내
    public static final String PICTURE_NO_BID_REJECT_MAIL = "mail/no-bid-reject-mail";

    // 경매 낙찰 안내 메일
    public static final String PICTURE_SUCCESSBID_MAIL = "mail/success-bid-picture-mail";

    // 경매 시작 안내 메일
    public static final String PICTURE_BIDDING_MAIL = "mail/bidding-picture-mail";

    public static final String PICTURE_APPROVE_MAIL = "mail/approve-picture-mail";
}
