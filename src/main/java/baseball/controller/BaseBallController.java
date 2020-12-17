package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Scanner;

public class BaseBallController {
    public static void playBaseball(Scanner scanner) {
        do {
            startBaseBall(scanner);
        } while(!finishBaseBall(scanner));
    }

    public static void startBaseBall(Scanner scanner) {
        OutputView.printStart();
        int number = InputView.scanNumber(scanner);
    }
    
    public static boolean finishBaseBall(Scanner scanner) {
        return true;
    }
}
