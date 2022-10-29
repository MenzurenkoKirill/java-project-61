package hexlet.code.games;

import java.util.Scanner;

public class Progression {
    static int iteration = 3;
    static int border1 = 1;
    static int border2 = 100;
    static int inclusive = 1;
    static int borderArray1 = 5;
    static int borderArray2 = 10;
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
        for (int i = 1; i <= iteration; i++) {
            int number1 = (int) (Math.random() * (border2 - border1 + inclusive)) + border1;
            int number2 = (int) (Math.random() * (border2 - border1 + inclusive)) + border1;
            int progressionLength = (int) (Math.random() * (borderArray2 - borderArray1 + inclusive)) + borderArray1;
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

