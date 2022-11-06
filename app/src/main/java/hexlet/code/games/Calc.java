package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Utils;


final public class Calc implements Game {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    private static final int MIN_VALUE_OPERATION = 1;
    private static final int MAX_VALUE_OPERATION = 3;

    public String getTask() {
        return "What is the result of the expression?";
    }

    public String[] getData() {
        String[] dataArray = new String[2];
        int operand1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int operand2 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int operation = Utils.getRandom(MIN_VALUE_OPERATION, MAX_VALUE_OPERATION);
        switch (operation) {
            case (1):
                dataArray[0] = "Question: " + operand1 + " + " + operand2;
                dataArray[1] = String.valueOf(operand1 + operand2);
                break;
            case (2):
                dataArray[0] = "Question: " + operand1 + " - " + operand2;
                dataArray[1] = String.valueOf(operand1 - operand2);
                break;
            case (MAX_VALUE_OPERATION):
                dataArray[0] = "Question: " + operand1 + " * " + operand2;
                dataArray[1] = String.valueOf(operand1 * operand2);
                break;
            default:
                System.exit(0);
        }
        return dataArray;
    }
}
