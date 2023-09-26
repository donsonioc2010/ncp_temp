package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.NOT_FOUND_ERROR;

public class NotFoundRestException extends RestBaseException{
    public static final RestBaseException EXCEPTION = new NotFoundRestException();

    private NotFoundRestException() {
        super(NOT_FOUND_ERROR);
    }
}
