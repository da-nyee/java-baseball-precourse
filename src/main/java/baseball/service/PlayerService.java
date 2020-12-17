package baseball.service;

import baseball.domain.Number;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {
    public static List<Integer> generatePlayerNumber(String number) {
        List<String> playerNumber = new ArrayList<>();

        for(int i = 0; i < number.length(); i++) {
            playerNumber.add(number.substring(i, i+1));
        }
        return new Number(playerNumber).getPlayerNumber();
    }
}
