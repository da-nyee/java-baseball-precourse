package baseball.domain;

import java.util.ArrayList;

public class Number {
    private final ArrayList<Integer> number;

    public Number(ArrayList<Integer> number) {
        this.number = number;
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    // 검증 함수 구현
}
