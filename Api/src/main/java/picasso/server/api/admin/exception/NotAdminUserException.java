package picasso.server.api.admin.exception;

import picasso.server.common.exception.BaseException;

import static picasso.server.common.exception.GlobalException.NOT_ADMIN;

/**
 * 관리자가 아닌경우 발생하는 EXCEPTION
 */
public class NotAdminUserException  extends BaseException {
    public static final BaseException EXCEPTION = new NotAdminUserException();

    public NotAdminUserException() {
        super(NOT_ADMIN);
    }
}
