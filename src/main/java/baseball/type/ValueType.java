package baseball.type;

public enum ValueType {
    BALL_VALUE(0),
    STRIKE_VALUE(1),
    INITIAL_VALUE(0),
    ANSWER_VALUE(3),
    FALSE(0),
    TRUE(1);

    private final int value;

    ValueType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
