package hexlet.code.games;

import hexlet.code.Utils;


public class Calc implements Game {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    private static final int MIN_VALUE_OPERATION = 0;
    private static final int MAX_VALUE_OPERATION = 2;

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

    public String[] getData() throws Exception {
        String[] dataArray = new String[2];
        int operand1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int operand2 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        String[] operationArray = new String[]{" + ", " - ", " * "};
        int operation = Utils.getRandom(MIN_VALUE_OPERATION, MAX_VALUE_OPERATION);
        switch (operationArray[operation]) {
            case (" + "):
                dataArray[0] = operand1 + operationArray[0] + operand2;
                dataArray[1] = String.valueOf(operand1 + operand2);
                break;
            case (" - "):
                dataArray[0] = operand1 + operationArray[1] + operand2;
                dataArray[1] = String.valueOf(operand1 - operand2);
                break;
            case (" * "):
                dataArray[0] = operand1 + operationArray[2] + operand2;
                dataArray[1] = String.valueOf(operand1 * operand2);
                break;
            default:
                System.exit(0);
                throw new Exception("В работе программы возникла ошибка");
        }
        return dataArray;
    }
}
