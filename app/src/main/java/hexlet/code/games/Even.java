package hexlet.code.games;

import hexlet.code.Utils;


public class Even implements Game {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;

    /**
     *
     * @return - возвращает задание
     */
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    /**
     *
     * @return - возвращает вопрос и правильный ответ
     */
    public String[] getData() {
        String[] dataArray = new String[2];
        int x = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        dataArray[0] = String.valueOf(x);
        dataArray[1] = x % 2 == 0 ? "yes" : "no";
        return dataArray;
    }
}
