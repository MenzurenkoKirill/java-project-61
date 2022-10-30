package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    private static final int MIN_RANGE = 1;
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
        greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 1; i <= ITERATION; i++) {
            int number1 = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + INCLUSIVE)) + MIN_RANGE;
            int number2 = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + INCLUSIVE)) + MIN_RANGE;
            int generateGcd  = findGcd(number1, number2);
            System.out.println("Question: " + number1 + " " + number2);
            Scanner scannerGsd = new Scanner(System.in);
            String userAnswer = scannerGsd.next();
            System.out.println("Your answer: " + userAnswer);
            if (Integer.parseInt(userAnswer) == generateGcd) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was"
                        + " '" + generateGcd + "'.\nLet's try again, " + userName + "!");
                return;
            }
        }
        congratulation();
    }
}

