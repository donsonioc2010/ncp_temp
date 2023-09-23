package picasso.server.api.admin.exception;

import picasso.server.common.exception.BaseException;

import static picasso.server.common.exception.GlobalException.NOT_ADMIN;

public class NotAdminUserException  extends BaseException {
    public static final BaseException EXCEPTION = new NotAdminUserException();

    public NotAdminUserException() {
        super(NOT_ADMIN);
    }
}
