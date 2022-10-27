package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static int findGcd(int n1, int n2) {
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
    public static void commonDivisor() {
        Engine.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 1; i <= 3; i++) {
            int number1 = (int) (Math.random() * 100) + 1;
            int number2 = (int) (Math.random() * 100) + 1;
            int generateGcd  = findGcd(number1, number2);
            System.out.println("Question: " + number1 + " " + number2);
            Scanner scannerGsd = new Scanner(System.in);
            String userAnswer = scannerGsd.next();
            System.out.println("Your answer: " + userAnswer);
            if (Integer.parseInt(userAnswer) == generateGcd) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was"
                        + " '" + generateGcd + "'.\nLet's try again, " + Engine.userName + "!");
                return;
            }
        }
        Engine.congratulation();
    }
}

