package picasso.server.api.admin.exception;

import picasso.server.common.exception.BaseException;

import java.io.NotActiveException;

import static picasso.server.common.exception.GlobalException.USER_STATUS_NOT_ACTIVE;

public class NotActiveStatusException extends BaseException  {
    public static final BaseException EXCEPTION = new NotActiveStatusException();
    private NotActiveStatusException() {super (USER_STATUS_NOT_ACTIVE);
    }
}
