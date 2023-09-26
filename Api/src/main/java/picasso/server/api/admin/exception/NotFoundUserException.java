package picasso.server.api.admin.exception;

import picasso.server.common.exception.BaseException;

import static picasso.server.common.exception.GlobalException.NOT_FOUND_USER_ERROR;

public class NotFoundUserException extends BaseException {
    public static final BaseException EXCEPTION = new NotFoundUserException();

public NotFoundUserException() { super(NOT_FOUND_USER_ERROR);}
}
