package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.ALREADY_EXISTS_PAYMENT_HISTORY_ERROR;

public class PaymentAlreadyExistsException extends BaseException {
  
  public static final BaseException EXCEPTION = new PaymentAlreadyExistsException();
  
  private PaymentAlreadyExistsException() {
    super(ALREADY_EXISTS_PAYMENT_HISTORY_ERROR);
  }
}
