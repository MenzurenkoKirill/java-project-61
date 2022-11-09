package hexlet.code.games;

import hexlet.code.Utils;

public class Progression implements Game {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MIN_STEP = -100;
    private static final int MAX_STEP = 100;
    private static final int ARRAY_MIN_RANGE = 5;
    private static final int ARRAY_MAX_RANGE = 10;

    /**
     *
     * @return - возвращает задание
     */
    public String getTask() {
        return "What number is missing in the progression?";
    }

    /**
     *
     * @return -возвращает вопрос и правильный ответ
     */
    public String[] getData() {
        String[] dataArray = new String[2];
        int number1 = Utils.getRandom(MIN_RANGE, MAX_RANGE);
        int progressionLength = Utils.getRandom(ARRAY_MIN_RANGE, ARRAY_MAX_RANGE);
        int[] arrayProgression = new int[progressionLength];
        arrayProgression[0] = number1;
        int step = Utils.getRandom(MIN_STEP, MAX_STEP);
        for (int j = 1; j <= arrayProgression.length - 1; j++) {
            arrayProgression[j] = arrayProgression[0] + (j * step);
        }

        String[] arrayWithSpace = new String[arrayProgression.length];
        for (int i = 0; i <= arrayProgression.length - 1; i++) {
            arrayWithSpace[i] = Integer.toString(arrayProgression[i]);
        }

        int randomIndex = (int) (Math.random() * (progressionLength - 2)) + 2;
        arrayWithSpace[randomIndex] = "..";
        String array = String.join(" ", arrayWithSpace);
        dataArray[0] = array;
        int correctAnswer = arrayProgression[randomIndex];
        dataArray[1] = String.valueOf(correctAnswer);
        return dataArray;
    }
}

