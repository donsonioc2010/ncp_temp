package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.NOT_FOUND_ERROR;

public class NotFoundException extends BaseException{
    public static final BaseException EXCEPTION = new NotFoundException();

    private NotFoundException() {
        super(NOT_FOUND_ERROR);
    }
}
