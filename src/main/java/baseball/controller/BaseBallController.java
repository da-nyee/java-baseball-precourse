package baseball.controller;

import baseball.domain.Hint;
import baseball.service.HintService;
import baseball.service.PlayerService;
import baseball.service.ProgramService;
import baseball.type.StatusType;
import baseball.type.ValueType;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;
import java.util.Scanner;

public class BaseBallController {
    public static void playBaseball(Scanner scanner) {
        do {
            ProgramService.initializeProgramNumber();
            startBaseBall(scanner);
        } while(!finishBaseBall(scanner));
    }

    public static void startBaseBall(Scanner scanner) {
        List<Integer> programNumber = ProgramService.generateProgramNumber();

        while (true) {
            OutputView.printStart();
            String number = InputView.scanNumber(scanner);
            List<Integer> playerNumber = PlayerService.generatePlayerNumber(number);

            if (isAnswer(playerNumber, programNumber)) {
                break;
            }
        }
    }

    public static boolean isAnswer(List<Integer> playerNumber, List<Integer> programNumber) {
        Hint hint = HintService.generateHint(playerNumber, programNumber);
        List<Integer> totalHint = HintService.getHint(hint);

        int ball = totalHint.get(ValueType.BALL_VALUE.getValue());
        int strike = totalHint.get(ValueType.STRIKE_VALUE.getValue());

        return OutputView.printHint(ball, strike);
    }
    
    public static boolean finishBaseBall(Scanner scanner) {
        String status = InputView.scanStatus(scanner);
        return status.equals(StatusType.FINISH.getStatus());
    }
}
