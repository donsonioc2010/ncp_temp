package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.FILE_IO_ERROR;

public class FileIOException extends BaseException {

    public static final BaseException EXCEPTION = new FileIOException();

    private FileIOException() {
        super(FILE_IO_ERROR);
    }

}

