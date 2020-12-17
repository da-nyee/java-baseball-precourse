package baseball.type;

public enum InitializationType {
    HINT(0);

    private final int initialization;

    InitializationType(int initialization) {
        this.initialization = initialization;
    }

    public int getInitialization() {
        return initialization;
    }
}
