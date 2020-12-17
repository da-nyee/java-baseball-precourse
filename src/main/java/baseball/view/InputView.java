package baseball.view;

import baseball.type.ExceptionType;
import baseball.type.StatusType;

import java.util.Scanner;

public class InputView {
    public static String scanNumber(Scanner scanner) {
        return scanner.nextLine();
    }

    public static String scanStatus(Scanner scanner) {
        String status = scanner.nextLine();

        if (isValidStatus(status)) {
            return status;
        }
        throw new IllegalArgumentException(ExceptionType.INVALID_STATUS.getException());
    }

    public static boolean isValidStatus(String status) {
        return (status.equals(StatusType.RESTART.getStatus()))
                || (status.equals(StatusType.FINISH.getStatus()));
    }
}
