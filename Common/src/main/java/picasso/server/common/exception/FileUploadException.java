package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.FILE_UPLOAD_ERROR;

public class FileUploadException extends BaseException {

    public static final BaseException EXCEPTION = new FileUploadException();

    private FileUploadException() {
        super(FILE_UPLOAD_ERROR);
    }

}

