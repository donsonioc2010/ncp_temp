package picasso.server.common.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * StatusCode : ControllerAdvice, RestControllerAdvice에서 ResponseEntity의 Status를 찾기 위함.
 * Reason : ResponseEntity에서 내용반환에 필요한 컬럼
 */
@Getter
@Builder
public class ErrorDetail {
    private final Integer statusCode;
    private final String reason;
    public static ErrorDetail of(Integer statusCode, String reason ) {
        return ErrorDetail.builder()
                .statusCode(statusCode)
                .reason(reason)
                .build();
    }
}
