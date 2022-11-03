package hexlet.code;

public class Utils {
    public static int getRandom(int minRange, int maxRange) {
        int inclusive = 1;
        int num = (int) (Math.random() * (maxRange - minRange + inclusive)) + minRange;
        return num;
    }
}
