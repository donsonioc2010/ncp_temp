package picasso.server.api.user.exception;

import picasso.server.common.exception.BaseException;

import static picasso.server.common.exception.GlobalException.LOGIN_ERROR;

public class LoginErrorException extends BaseException {
  public static final BaseException EXCEPTION = new LoginErrorException();

  public LoginErrorException() {
    super(LOGIN_ERROR);
  }
}