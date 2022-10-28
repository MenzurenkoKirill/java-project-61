package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void numberGame() {
        String yesAnswer = "yes";
        String noAnswer = "no";
        Scanner scannerNumberGame = new Scanner(System.in);
        Engine.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 1; i <= 3; i++) {
            int x = (int) (Math.random() * 1001);
            System.out.println("Question: " + x);
            String answer = scannerNumberGame.next();
            System.out.println("Your answer: " + answer);
            if (x % 2 == 0 & answer.equals(yesAnswer)) {
                System.out.println("Correct!");
            } else if (x % 2 != 0 & answer.equals(yesAnswer)) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'\n"
                        + " Let's try again, " + Engine.userName + "!");
                return;
            } else if (x % 2 == 0 & answer.equals(noAnswer)) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'\n"
                        + " Let's try again, " + Engine.userName + "!");
                return;
            } else if (x % 2 != 0 & answer.equals(noAnswer)) {
                System.out.println("Correct!");
            } else {
                if (x % 2 != 0) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'\n"
                            + " Let's try again, " + Engine.userName + "!");
                    return;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'\n"
                            + " Let's try again, " + Engine.userName + "!");
                    return;
                }
            }
        }
        Engine.congratulation();
    }
}
