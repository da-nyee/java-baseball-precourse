package baseball.service;

import baseball.type.BoundaryType;
import baseball.type.SizeType;
import baseball.type.ValueType;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class ProgramService {
    private static List<Integer> programNumber = new ArrayList<>();

    public static List<Integer> generateProgramNumber() {
        List<Integer> flag = initializeFlag();

        while (programNumber.size() != SizeType.NUMBER_SIZE.getSize()) {
            int random = RandomUtils.nextInt(BoundaryType.MINIMUM_NUMBER.getBoundary(),
                    BoundaryType.MAXIMUM_NUMBER.getBoundary());

            if (isValidRandom(random, flag)) {
                programNumber.add(random);
                flag.set(random, ValueType.TRUE.getValue());
            }
        }
        return programNumber;
    }

    public static List<Integer> initializeFlag() {
        List<Integer> flag = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            flag.add(ValueType.FALSE.getValue());
        }
        return flag;
    }

    public static boolean isValidRandom(int random, List<Integer> flag) {
        return flag.get(random) == ValueType.FALSE.getValue();
    }

    public static void initializeProgramNumber() {
        programNumber.clear();
    }
}

