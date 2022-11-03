package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int ARRAY_MIN_RANGE = 5;
    private static final int ARRAY_MAX_RANGE = 10;
    public static int arithmeticProgression() {
        int number1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int number2 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int progressionLength = Utils.getRandom(ARRAY_MIN_RANGE, ARRAY_MAX_RANGE);
        int randomIndex = (int) (Math.random() * (progressionLength - 2)) + 2;
        int[] arrayProgression = new int[progressionLength];
        arrayProgression[0] = number1;
        arrayProgression[1] = number2;
        int d = number2 - number1;
        for (int j = 2; j <= arrayProgression.length - 1; j++) {
            arrayProgression[j] = arrayProgression[0] + (j * d);
        }
        int correctAnswer = arrayProgression[randomIndex];
        String[] arrayWithSpace = new String[arrayProgression.length];
        for (int c = 0; c <= arrayProgression.length - 1; c++) {
            arrayWithSpace[c] = Integer.toString(arrayProgression[c]);
        }
        arrayWithSpace[randomIndex] = "..";
        String array = String.join(" ", arrayWithSpace);
        System.out.println("Question: " + array);
        return correctAnswer;
    }
}

