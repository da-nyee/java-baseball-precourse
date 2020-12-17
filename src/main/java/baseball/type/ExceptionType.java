package baseball.type;

public enum ExceptionType {
    INVALID_LENGTH("3자리보다 짧은 길이의 숫자 또는 긴 길이의 숫자는 입력될 수 없습니다."),
    INVALID_BOUNDARY("문자 또는 0은 입력될 수 없습니다."),
    INVALID_DUPLICATE("중복되는 숫자는 입력될 수 없습니다."),
    INVALID_STATUS("1 또는 2만 입력해주세요.");

    private String exception;

    ExceptionType(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }
}
