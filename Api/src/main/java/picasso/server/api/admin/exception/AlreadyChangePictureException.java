package picasso.server.api.admin.exception;

import picasso.server.common.exception.BaseException;

import static picasso.server.common.exception.GlobalException.PICTURE_STATUS_AFTER_APPROVE;

/**
 *  이미 관리자가 승인한 게시물인 경우 발생되는 Exception
 */
public class AlreadyChangePictureException extends BaseException {
    public static final BaseException EXCEPTION = new AlreadyChangePictureException();
    private AlreadyChangePictureException() {
        super(PICTURE_STATUS_AFTER_APPROVE);
    }
}
