package hexlet.code.games;

import hexlet.code.Utils;

public class Prime {
    private static final int MIN_RANGE = 2;
    private static final int MAX_RANGE = 1000;

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
    public static boolean naturalNumber() {
        int number = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        System.out.println("Question: " + number);
        return isSimple(number);
    }
}

