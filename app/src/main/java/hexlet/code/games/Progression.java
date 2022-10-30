package hexlet.code.games;

import java.util.Scanner;

public class Progression {
    private static final int ITERATION = 3;
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int INCLUSIVE = 1;
    private static final int ARRAY_MIN_RANGE = 5;
    private static final int ARRAY_MAX_RANGE = 10;
    private static String userName;
    private static void setUserName(String name) {
        userName = name;
    }
    private static void greetings() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scannerGreetings = new Scanner(System.in);
        String name = scannerGreetings.next();
        setUserName(name);
        System.out.println("Hello, " + userName + "!");
    }
    private static void congratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void arithmeticProgression() {
        greetings();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (int i = 1; i <= ITERATION; i++) {
            int number1 = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + INCLUSIVE)) + MIN_RANGE;
            int number2 = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + INCLUSIVE)) + MIN_RANGE;
            int progressionLength = (int) (Math.random() * (ARRAY_MAX_RANGE - ARRAY_MIN_RANGE + INCLUSIVE))
                    + ARRAY_MIN_RANGE;
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
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            if (Integer.parseInt(userAnswer) == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was"
                        + " '" + correctAnswer + "'.\nLet's try again, " + userName + "!");
                return;
            }
        }
        congratulation();
    }
}

