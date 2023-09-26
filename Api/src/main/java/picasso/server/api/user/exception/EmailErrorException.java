package picasso.server.api.user.exception;

import picasso.server.common.exception.BaseException;

import static picasso.server.common.exception.GlobalException.EMAIL_ERROR;

public class EmailErrorException extends BaseException {
  public static final BaseException EXCEPTION = new EmailErrorException();

  public EmailErrorException() { super(EMAIL_ERROR);}
}
