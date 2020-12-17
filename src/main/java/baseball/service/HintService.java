package baseball.service;

import baseball.domain.Hint;
import baseball.type.InitializationType;

import java.util.ArrayList;
import java.util.List;

public class HintService {
    public static Hint generateHint(List<Integer> playerNumber, List<Integer> programNumber) {
        Hint hint = initializeHint();

        hint.isSameNumber(playerNumber, programNumber);
        hint.isSamePosition(playerNumber, programNumber);
        return hint;
    }

    public static Hint initializeHint() {
        return new Hint(InitializationType.HINT.getInitialization(),
                InitializationType.HINT.getInitialization());
    }

    public static List<Integer> getHint(Hint hint) {
        List<Integer> totalHint = new ArrayList<>();

        totalHint.add(hint.getBall());
        totalHint.add(hint.getStrike());
        return totalHint;
    }
}
