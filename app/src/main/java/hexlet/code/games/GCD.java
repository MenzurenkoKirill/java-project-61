package hexlet.code.games;

import hexlet.code.Utils;


public class GCD implements Game {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static int findGcd(int n1, int n2) {
        int gcd;
        if (n1 < n2) {
            findGcd(n2, n1);
        }
        while (n2 != 0) {
            gcd = n1 % n2;
            n1 = n2;
            n2 = gcd;
        }
        return n1;
    }

    /**
     *
     * @return - возвращает задание
     */
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    /**
     *
     * @return - возвращает вопрос и правильный ответ
     */
    public String[] getData() {
        String[] dataArray = new String[2];
        int number1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int number2 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int generateGcd  = findGcd(number1, number2);
        dataArray[0] = number1 + " " + number2;
        dataArray[1] = String.valueOf(generateGcd);
        return dataArray;
    }
}

