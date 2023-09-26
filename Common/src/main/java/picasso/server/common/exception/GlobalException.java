package picasso.server.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import picasso.server.common.dto.ErrorDetail;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

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
    ALREADY_EXISTS_PAYMENT_HISTORY_ERROR(INTERNAL_SERVER_ERROR.value(), "이미 존재하는 결제 내역입니다"),
    PAYMENT_FAILED_ERROR(INTERNAL_SERVER_ERROR.value(), "결제 실패 오류입니다."),
    NOT_ADMIN(UNAUTHORIZED.value(), "관리자만 사용가능한 페이지입니다."),
    NOT_FOUND_ERROR(NOT_FOUND.value(), "검색 결과가 존재하지 않습니다"),
    PICTURE_STATUS_AFTER_APPROVE(INTERNAL_SERVER_ERROR.value(), "이미 관리자가 승인한 게시물 입니다."),
    NOT_LOGIN_EXCEPTION(UNAUTHORIZED.value(),  "로그인이 필요합니다."),
    NEED_LOGIN_ERROR(UNAUTHORIZED.value(), "로그인이 필요한 기능입니다."),
    NOT_FOUND_USER_ERROR(NOT_FOUND.value(), "존재하지 않은 회원입니다."),
    USER_STATUS_NOT_ACTIVE(INTERNAL_SERVER_ERROR.value(), "정지할 수 없는 유저입니다."),
    USER_NOT_FOUND_ERROR(NOT_FOUND.value(), "유저를 찾을 수 없습니다.")

    ;

    private final Integer statusCode;
    private final String reason;

    @Override
    public ErrorDetail getErrorDetail() {
        return ErrorDetail.of(statusCode, reason);
    }
}
