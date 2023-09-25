package picasso.server.api.config.advice;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import picasso.server.common.dto.ErrorDetail;
import picasso.server.common.exception.BaseException;
import picasso.server.common.exception.GlobalException;

@Slf4j
@RequiredArgsConstructor
@ControllerAdvice
public class GlobalControllerExceptionHandler {
    @ExceptionHandler(BaseException.class)
    protected String baseExceptionHandle(BaseException e, HttpServletRequest request) {
        ErrorDetail errorDetail = e.getErrorCode().getErrorDetail();
        log.warn("ExceptionName >>> {}, ErrorCode >>> {}, ExceptionReason >>> {}",
                e.getClass(), errorDetail.getStatusCode(), errorDetail.getReason());

        return "redirect:/error";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDetail> argumentNotValidHandle(MethodArgumentNotValidException e, HttpServletRequest request) {
        ErrorDetail errorDetail = ErrorDetail.builder()
                .statusCode(GlobalException.METHOD_ARGUMENT_ERROR.getStatusCode())
                .reason(GlobalException.METHOD_ARGUMENT_ERROR.getReason())
                .build();
        return ResponseEntity.status(errorDetail.getStatusCode()).body(errorDetail);
    }
}
