package picasso.server.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import picasso.server.common.dto.ErrorDetail;

@Getter
@AllArgsConstructor
public abstract class BaseException extends RuntimeException {
    private BaseErrorCode errorCode;

    public ErrorDetail getErrorDetail() {
        return this.errorCode.getErrorDetail();
    }
}
