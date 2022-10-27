package hexlet.code.games;

import java.util.Scanner;
import  hexlet.code.Engine;

public class Calc {
    public static void numeracy() {
        Engine.greetings();
        Scanner scannerNumeracy = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int operand1 = (int) (Math.random() * 101);
            int operand2 = (int) (Math.random() * 101);
            int operation = (int) (Math.random() * 3) + 1;
            switch (operation) {
                case(1):
                    System.out.println("Question: " + operand1 + " + " + operand2);
                    String userAnswer1 = scannerNumeracy.next();
                    System.out.println("Your answer: " + userAnswer1);
                    int answer1 = Integer.parseInt(userAnswer1);
                    if (answer1 == (operand1 + operand2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + userAnswer1 + "' is wrong answer ;(. Correct answer was '" + +
                                +(operand1 + operand2) + "'.");
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
                        System.out.println("'" + userAnswer2 + "' is wrong answer ;(. Correct answer was '" + +
                                +(operand1 - operand2) + "'.");
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
                        System.out.println("'" + userAnswer3 + "' is wrong answer ;(. Correct answer was '" + +
                                +(operand1 * operand2) + "'.");
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

