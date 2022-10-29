package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    static int border1 = 2;
    static int border2 = 1000;
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
        greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= iteration; i++) {
            int number = (int) (Math.random() * (border2 - border1 + inclusive)) + border1;
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
                            + " 'no'.\nLet's try again, " + userName + "!");
                    return;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was"
                            + " 'yes'.\nLet's try again, " + userName + "!");
                    return;
                }
            }
            congratulation();
        }
    }
}

