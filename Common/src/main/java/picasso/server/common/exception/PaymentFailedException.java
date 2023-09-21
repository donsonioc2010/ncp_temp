package picasso.server.common.exception;

import static picasso.server.common.exception.GlobalException.*;

public class PaymentFailedException extends BaseException {
  public static final BaseException EXCEPTION = new PaymentFailedException();
  
  private PaymentFailedException() {
    super(PAYMENT_FAILED_ERROR);
  }
}
