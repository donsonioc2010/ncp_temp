package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.ALREADY_EXISTS_PAYMENT_HISTORY_ERROR;

public class PaymentException extends BaseException {
  
  public static final BaseException EXCEPTION = new PaymentException();
  
  private PaymentException() {
    super(ALREADY_EXISTS_PAYMENT_HISTORY_ERROR);
  }
}
