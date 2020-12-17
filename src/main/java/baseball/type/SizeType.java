package baseball.type;

public enum SizeType {
    NUMBER_SIZE(3);

    private final int size;

    SizeType(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
