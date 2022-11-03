package hexlet.code.games;

import hexlet.code.Utils;


public class Calc {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    private static final int MIN_VALUE_OPERATION = 1;
    private static final int MAX_VALUE_OPERATION = 3;

    public static int[] numeracy() {
        int operand1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int operand2 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int operation = Utils.getRandom(MIN_VALUE_OPERATION, MAX_VALUE_OPERATION);
        return new int[]{operand1, operand2, operation};
    }
}

