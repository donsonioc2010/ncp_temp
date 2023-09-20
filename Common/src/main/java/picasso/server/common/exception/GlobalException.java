package picasso.server.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import picasso.server.common.dto.ErrorDetail;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Getter
@AllArgsConstructor
public enum GlobalException implements BaseErrorCode {
    EXAMPLE_ERROR(BAD_REQUEST.value(), "에러 예시 입니다."),
    METHOD_ARGUMENT_ERROR(BAD_REQUEST.value(), "메서드 인자가 유효하지 않거나 @Valid를 통과하지 못하여 발생하는 예외입니다."),
    INTERNAL_SERVER_ERRORS(INTERNAL_SERVER_ERROR.value(), "서버 내부 오류입니다."),
    DATE_FORMAT_ERROR(BAD_REQUEST.value(), "날짜 형식을 확인해주세요."),
    FILE_UPLOAD_ERROR(INTERNAL_SERVER_ERROR.value(), "파일 업로드 중 오류가 발생하였습니다"),
    FILE_DELETE_ERROR(INTERNAL_SERVER_ERROR.value(), "파일 삭제 중 오류가 발생하였습니다"),
    FILE_IO_ERROR(INTERNAL_SERVER_ERROR.value(), "파일 변환 중 오류가 발생하였습니다"),
    ILLEGAL_ARGUMENT_ERROR(BAD_REQUEST.value(), "인자 값 문제로 인한 오류가 발생하였습니다"),
    MAIL_SEND_ERROR(INTERNAL_SERVER_ERROR.value(), "메일 발송중 오류가 발생하였습니다"),
    ALREADY_EXISTS_PAYMENT_HISTORY_ERROR(INTERNAL_SERVER_ERROR.value(), "이미 존재하는 결제 내역입니다");

    private final Integer statusCode;
    private final String reason;

    @Override
    public ErrorDetail getErrorDetail() {
        return ErrorDetail.of(statusCode, reason);
    }
}
