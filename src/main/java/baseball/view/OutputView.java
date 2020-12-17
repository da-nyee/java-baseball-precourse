package baseball.view;

import baseball.type.ExceptionType;
import baseball.type.HintType;
import baseball.type.TextType;
import baseball.type.ValueType;

public class OutputView {
    public static void printStart() {
        System.out.print(TextType.START.getText());
    }

    public static String printInvalidLengthException() {
        return ExceptionType.INVALID_LENGTH.getException();
    }

    public static String printInvalidBoundaryException() {
        return ExceptionType.INVALID_BOUNDARY.getException();
    }

    public static String printInvalidDuplicateException() {
        return ExceptionType.INVALID_DUPLICATE.getException();
    }

    public static boolean printHint(int ball, int strike) {
        if ((ball != ValueType.INITIAL_VALUE.getValue())
                && (strike == ValueType.INITIAL_VALUE.getValue())) {
            return printOnlyBall(ball);
        }
        if ((ball == ValueType.INITIAL_VALUE.getValue())
                && (strike != ValueType.INITIAL_VALUE.getValue())) {
            if (strike != ValueType.ANSWER_VALUE.getValue()) {
                return printOnlyStrike(strike);
            }
            return printAnswer(strike);
        }
        if (ball == ValueType.INITIAL_VALUE.getValue()) {
            return printNothing();
        }
        return printBallAndStrike(ball, strike);
    }

    public static boolean printOnlyBall(int ball) {
        System.out.println(ball + HintType.BALL.getHint());
        return false;
    }

    public static boolean printOnlyStrike(int strike) {
        printStrike(strike);
        return false;
    }

    public static boolean printAnswer(int strike) {
        printStrike(strike);
        System.out.println(TextType.ANSWER.getText());
        System.out.println(TextType.RESTART_OR_FINISH.getText());
        return true;
    }

    public static void printStrike(int strike) {
        System.out.println(strike + HintType.STRIKE.getHint());
    }

    public static boolean printNothing() {
        System.out.println(HintType.NOTHING.getHint());
        return false;
    }

    public static boolean printBallAndStrike(int ball, int strike) {
        System.out.println(ball + HintType.BALL.getHint() + " " + strike + HintType.STRIKE.getHint());
        return false;
    }
}
