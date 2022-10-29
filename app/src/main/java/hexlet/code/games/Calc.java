package hexlet.code.games;

import java.util.Scanner;
import  hexlet.code.Engine;

public class Calc {
    public static void numeracy() {
        Engine.greetings();
        Scanner scannerNumeracy = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int border1 = 0;
        int border2 = 100;
        int iteration = 3;
        int inclusive = 1;
        int borderOperation1 = 1;
        int borderOperation2 = 3;
        for (int i = 1; i <= iteration; i++) {
            int operand1 = (int) (Math.random() * (border2 - border1 + inclusive)) + border1;
            int operand2 = (int) (Math.random() * (border2 - border1 + inclusive)) + border1;
            int operation = (int) (Math.random() * (borderOperation2 - borderOperation1 + inclusive))
                    + borderOperation1;
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
                                + (operand1 + operand2) + "'.\nLet's try again, " + Engine.userName + "!");
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
                                + (operand1 - operand2) + "'.\nLet's try again, " + Engine.userName + "!");
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
                                + (operand1 * operand2) + "'.\nLet's try again, " + Engine.userName + "!");
                        return;
                    }
                    break;
                default:
                    return;
            }
        }
        Engine.congratulation();
    }
}

