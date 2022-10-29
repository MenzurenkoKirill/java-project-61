package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    static int border1 = 1;
    static int border2 = 100;
    static int iteration = 3;
    static int inclusive = 1;
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
        for (int i = 1; i <= iteration; i++) {
            int number1 = (int) (Math.random() * (border2 - border1 + inclusive)) + border1;
            int number2 = (int) (Math.random() * (border2 - border1 + inclusive)) + border1;
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

