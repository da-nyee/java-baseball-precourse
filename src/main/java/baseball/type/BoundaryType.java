package baseball.type;

public enum BoundaryType {
    MINIMUM_NUMBER(1),
    MAXIMUM_NUMBER(9),
    MINIMUM_ASCII(49),
    MAXIMUM_ASCII(57);

    private final int boundary;

    BoundaryType(int boundary) {
        this.boundary = boundary;
    }

    public int getBoundary() {
        return boundary;
    }
}
