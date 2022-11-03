package hexlet.code.games;

import hexlet.code.Utils;


public class Even {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    public static int numberGame() {
        int x = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        System.out.println("Question: " + x);
        return x;
    }
}
