package hexlet.code.games;

import java.util.Scanner;

public class Even {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    private static final int ITERATION = 3;
    private static final int INCLUSIVE = 1;
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
    public static void numberGame() {
        String yesAnswer = "yes";
        String noAnswer = "no";
        Scanner scannerNumberGame = new Scanner(System.in);
        greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 1; i <= ITERATION; i++) {
            int x = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + INCLUSIVE)) + MIN_RANGE;
            System.out.println("Question: " + x);
            String answer = scannerNumberGame.next();
            System.out.println("Your answer: " + answer);
            if (x % 2 == 0 & answer.equals(yesAnswer)) {
                System.out.println("Correct!");
            } else if (x % 2 != 0 & answer.equals(yesAnswer)) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'\n"
                        + " Let's try again, " + userName + "!");
                return;
            } else if (x % 2 == 0 & answer.equals(noAnswer)) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'\n"
                        + " Let's try again, " + userName + "!");
                return;
            } else if (x % 2 != 0 & answer.equals(noAnswer)) {
                System.out.println("Correct!");
            } else {
                if (x % 2 != 0) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'\n"
                            + " Let's try again, " + userName + "!");
                    return;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'\n"
                            + " Let's try again, " + userName + "!");
                    return;
                }
            }
        }
        congratulation();
    }
}
