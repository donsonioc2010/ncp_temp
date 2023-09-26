package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.NOT_LOGIN_EXCEPTION;

public class NotLoginUserRestException extends RestBaseException{
    public static RestBaseException EXCEPTION = new NotLoginUserRestException();

    private NotLoginUserRestException() {
        super(NOT_LOGIN_EXCEPTION);
    }

}
