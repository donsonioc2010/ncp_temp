package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.FILE_DELETE_ERROR;
import static picasso.server.common.exception.GlobalException.FILE_UPLOAD_ERROR;

public class FileDeleteException extends BaseException {

    public static final BaseException EXCEPTION = new FileDeleteException();

    private FileDeleteException() {
        super(FILE_DELETE_ERROR);
    }

}

