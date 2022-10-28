package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
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
    public static void naturalNumber() {
        Engine.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int number = (int) (Math.random() * 999) + 2;
            System.out.println("Question: " + number);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if ((isSimple(number)) && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (((!isSimple(number)) && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was"
                            + " 'no'.\nLet's try again, " + Engine.userName + "!");
                    return;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was"
                            + " 'yes'.\nLet's try again, " + Engine.userName + "!");
                    return;
                }
            }
            Engine.congratulation();
        }
    }
}

