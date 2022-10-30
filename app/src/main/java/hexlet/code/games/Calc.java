package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;
    private static final int ITERATION = 3;
    private static final int INCLUSIVE = 1;
    private static final int MIN_VALUE_OPERATION = 1;
    private static final int MAX_VALUE_OPERATION = 3;
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
    public static void numeracy() {
        greetings();
        Scanner scannerNumeracy = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        for (int i = 1; i <= ITERATION; i++) {
            int operand1 = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + INCLUSIVE)) + MIN_RANGE;
            int operand2 = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + INCLUSIVE)) + MIN_RANGE;
            int operation = (int) (Math.random() * (MAX_VALUE_OPERATION - MIN_VALUE_OPERATION + INCLUSIVE))
                    + MIN_VALUE_OPERATION;
            switch (operation) {
                case(1):
                    System.out.println("Question: " + operand1 + " + " + operand2);
                    String userAnswer1 = scannerNumeracy.next();
                    System.out.println("Your answer: " + userAnswer1);
                    int answer1 = Integer.parseInt(userAnswer1);
                    if (answer1 == (operand1 + operand2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + userAnswer1 + "' is wrong answer ;(. Correct answer was '"
                                + (operand1 + operand2) + "'.\nLet's try again, " + userName + "!");
                        return;
                    }
                    break;
                case(2):
                    System.out.println("Question: " + operand1 + " - " + operand2);
                    String userAnswer2 = scannerNumeracy.next();
                    System.out.println("Your answer: " + userAnswer2);
                    int answer2 = Integer.parseInt(userAnswer2);
                    if (answer2 == (operand1 - operand2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + userAnswer2 + "' is wrong answer ;(. Correct answer was '"
                                + (operand1 - operand2) + "'.\nLet's try again, " + userName + "!");
                        return;
                    }
                    break;
                case(3):
                    System.out.println("Question: " + operand1 + " * " + operand2);
                    String userAnswer3 = scannerNumeracy.next();
                    System.out.println("Your answer: " + userAnswer3);
                    int answer3 = Integer.parseInt(userAnswer3);
                    if (answer3 == (operand1 * operand2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + userAnswer3 + "' is wrong answer ;(. Correct answer was '"
                                + (operand1 * operand2) + "'.\nLet's try again, " + userName + "!");
                        return;
                    }
                    break;
                default:
                    return;
            }
        }
        congratulation();
    }
}

