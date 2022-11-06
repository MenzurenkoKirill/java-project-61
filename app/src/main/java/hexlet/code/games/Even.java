package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Utils;


final public class Even implements Game {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String[] getData() {
        String[] dataArray = new String[2];
        int x = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        dataArray[0] = "Question: " + x;
        if (x % 2 == 0) {
            dataArray[1] = "yes";
        } else {
            dataArray[1] = "no";
        }
        return dataArray;
    }
}
