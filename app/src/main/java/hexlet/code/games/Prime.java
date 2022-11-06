package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Utils;

public class Prime implements Game {
    private static final int MIN_RANGE = 2;
    private static final int MAX_RANGE = 1000;

    /**
     *
     * @return - возвращает задание
     */
    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    /**
     *
     * @return - возвращает вопрос и правильный ответ
     */
    public String[] getData() {
        String[] dataArray = new String[2];
        int number = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        dataArray[0] = "Question: " + number;
        if (isSimple(number)) {
            dataArray[1] = "yes";
        } else {
            dataArray[1] = "no";
        }
        return dataArray;
    }
    public static boolean isSimple(int x) {
        if (x < 2) {
            return false;
        }
        int s = (int) Math.sqrt(x);
        for (int i = 2; i <= s; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

