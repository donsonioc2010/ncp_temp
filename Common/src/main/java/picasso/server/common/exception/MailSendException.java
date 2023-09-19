package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.MAIL_SEND_ERROR;

public class MailSendException extends BaseException {
    public static final MailSendException EXCEPTION = new MailSendException();

    public MailSendException() {
        super(MAIL_SEND_ERROR);
    }
}
