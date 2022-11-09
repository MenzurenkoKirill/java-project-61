package hexlet.code.games;

import hexlet.code.Utils;


public class Calc implements Game {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    private static final int MIN_VALUE_OPERATION = 0;
    private static final int MAX_VALUE_OPERATION = 2;
    private static final String[] OPERATION_ARRAY = new String[]{" + ", " - ", " * "};

    /**
     *
     * @return - возвращает задание
     */

    public String getTask() {
        return "What is the result of the expression?";
    }

    /**
     *
     * @return - возвращает вопрос и правильный ответ
     */

    public String[] getData() throws RuntimeException {
        String[] dataArray = new String[2];
        int operand1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int operand2 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int operation = Utils.getRandom(MIN_VALUE_OPERATION, MAX_VALUE_OPERATION);
        switch (OPERATION_ARRAY[operation]) {
            case (" + "):
                dataArray[0] = operand1 + OPERATION_ARRAY[0] + operand2;
                dataArray[1] = String.valueOf(operand1 + operand2);
                break;
            case (" - "):
                dataArray[0] = operand1 + OPERATION_ARRAY[1] + operand2;
                dataArray[1] = String.valueOf(operand1 - operand2);
                break;
            case (" * "):
                dataArray[0] = operand1 + OPERATION_ARRAY[2] + operand2;
                dataArray[1] = String.valueOf(operand1 * operand2);
                break;
            default:
                throw new RuntimeException("Неизвестный оператор");
        }
        return dataArray;
    }
}
