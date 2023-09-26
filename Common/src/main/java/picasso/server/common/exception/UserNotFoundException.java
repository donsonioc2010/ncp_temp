package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.NOT_FOUND_ERROR;

public class UserNotFoundException extends BaseException {
  public static final BaseException EXCEPTION = new UserNotFoundException();
  
  private UserNotFoundException() {
    super(NOT_FOUND_ERROR);
  }
}
