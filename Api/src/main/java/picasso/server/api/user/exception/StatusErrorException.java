package picasso.server.api.user.exception;

import picasso.server.common.exception.BaseException;

import static picasso.server.common.exception.GlobalException.STATUS_ERROR;

public class StatusErrorException extends BaseException {
  public static final BaseException EXCEPTION = new StatusErrorException();

  public StatusErrorException() { super(STATUS_ERROR); }
}
