package baseball.domain;

import baseball.type.BoundaryType;
import baseball.type.SizeType;
import baseball.view.OutputView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number {
    private final List<String> number;

    public Number(List<String> number) {
        // 일급 컬렉션
        isValidNumber(number);
        this.number = number;
    }

    public List<Integer> getPlayerNumber() {
        List<Integer> playerNumber = new ArrayList<>();

        for (String currentNumber : number) {
            playerNumber.add(Integer.parseInt(currentNumber));
        }
        return playerNumber;
    }

    public static void isValidNumber(List<String> number) {
        isValidLength(number);
        isValidBoundary(number);
        isDuplicate(number);
    }

    public static void isValidLength(List<String> number) {
        if (number.size() != SizeType.NUMBER_SIZE.getSize()) {
            throw new IllegalArgumentException(OutputView.printInvalidLengthException());
        }
    }

    public static void isValidBoundary(List<String> number) {
        for (String currentNumber : number) {
            char playerAscii = currentNumber.charAt(0);

            if ((playerAscii < BoundaryType.MINIMUM_ASCII.getBoundary())
                    || (playerAscii > BoundaryType.MAXIMUM_ASCII.getBoundary())) {
                throw new IllegalArgumentException(OutputView.printInvalidBoundaryException());
            }
        }
    }

    public static void isDuplicate(List<String> number) {
        Set<String> distinctNumber = new HashSet<>(number);

        if (distinctNumber.size() != SizeType.NUMBER_SIZE.getSize()) {
            throw new IllegalArgumentException(OutputView.printInvalidDuplicateException());
        }
    }
}
