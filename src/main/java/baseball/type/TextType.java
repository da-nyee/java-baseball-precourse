package baseball.type;

public enum TextType {
    START("숫자를 입력해주세요 : "),
    ANSWER("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART_OR_FINISH("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String text;

    TextType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
