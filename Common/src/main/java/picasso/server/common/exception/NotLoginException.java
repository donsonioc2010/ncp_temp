package picasso.server.common.exception;

public class NotLoginException extends BaseException {

    public static final BaseException EXCEPTION = new NotLoginException();

    private NotLoginException() {
        super(GlobalException.NEED_LOGIN_ERROR);
    }

}

