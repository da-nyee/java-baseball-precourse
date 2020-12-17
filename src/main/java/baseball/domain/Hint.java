package baseball.domain;

import java.util.List;

public class Hint {
    private int strike;
    private int ball;

    public Hint(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void isSameNumber(List<Integer> playerNumber, List<Integer> programNumber) {
        for (Integer player : playerNumber) {
            if (programNumber.contains(player)) {
                ball++;
            }
        }
    }

    public void isSamePosition(List<Integer> playerNumber, List<Integer> programNumber) {
        for (int i = 0; i < playerNumber.size(); i++) {
            if (playerNumber.get(i).equals(programNumber.get(i))) {
                strike++;
                ball--;
            }
        }
    }
}
