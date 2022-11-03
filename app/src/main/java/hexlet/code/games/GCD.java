package hexlet.code.games;

import hexlet.code.Utils;


public class GCD {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static int findGcd(int n1, int n2) {
        int gcd;
        if (n1 < n2) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        while (n2 != 0) {
            gcd = n1 % n2;
            n1 = n2;
            n2 = gcd;
        }
        return n1;
    }
    public static int[] commonDivisor() {
        int number1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int number2 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int generateGcd  = findGcd(number1, number2);
        return new int[]{number1, number2, generateGcd};
    }
}

