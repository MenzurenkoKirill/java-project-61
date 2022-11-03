package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

final class Engine {
    private static final int MAX_VALUE_OPERATION = 3;
    private static final int ITERATION = 3;
    private String userName;

    private void congratulation() {
        System.out.println("Congratulations, " + this.userName + "!");
    }

    private void setUserName(String name) {
        this.userName = name;
    }

    public void greetings() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scannerGreetings = new Scanner(System.in);
        String userName1 = scannerGreetings.next();
        this.setUserName(userName1);
        System.out.println("Hello, " + this.userName + "!");
    }

    public void gameTwo() {
        this.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scannerNumberGame = new Scanner(System.in);
        String yesAnswer = "yes";
        String noAnswer = "no";
        for (int i = 1; i <= ITERATION; i++) {
            int num = Even.numberGame();
            String answer = scannerNumberGame.next();
            System.out.println("Your answer: " + answer);
            if (num % 2 == 0 & answer.equals(yesAnswer)) {
                System.out.println("Correct!");
            } else if (num % 2 != 0 & answer.equals(noAnswer)) {
                System.out.println("Correct!");
            } else {
                if (answer.equals(yesAnswer)) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'\n"
                            + " Let's try again, " + this.userName + "!");
                    return;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'\n"
                            + " Let's try again, " + this.userName + "!");
                    return;
                }
            }
        }
        this.congratulation();
    }
    public void gameThree() {
        this.greetings();
        Scanner scannerNumeracy = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        for (int i = 1; i <= ITERATION; i++) {
            int[] arrayForGameThree = Calc.numeracy();
            int operand1 = arrayForGameThree[0];
            int operand2 = arrayForGameThree[1];
            int operation = arrayForGameThree[2];
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
                                + (operand1 + operand2) + "'.\nLet's try again, " + this.userName + "!");
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
                                + (operand1 - operand2) + "'.\nLet's try again, " + this.userName + "!");
                        return;
                    }
                    break;
                case(MAX_VALUE_OPERATION):
                    System.out.println("Question: " + operand1 + " * " + operand2);
                    String userAnswer3 = scannerNumeracy.next();
                    System.out.println("Your answer: " + userAnswer3);
                    int answer3 = Integer.parseInt(userAnswer3);
                    if (answer3 == (operand1 * operand2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + userAnswer3 + "' is wrong answer ;(. Correct answer was '"
                                + (operand1 * operand2) + "'.\nLet's try again, " + this.userName + "!");
                        return;
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
        this.congratulation();
    }
    public void gameFour() {
        this.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 1; i <= ITERATION; i++) {
            int[] arrayForGameFour = GCD.commonDivisor();
            int num1 = arrayForGameFour[0];
            int num2 = arrayForGameFour[1];
            int generateGcd = arrayForGameFour[2];
            System.out.println("Question: " + num1 + " " + num2);
            Scanner scannerGsd = new Scanner(System.in);
            String userAnswer = scannerGsd.next();
            System.out.println("Your answer: " + userAnswer);
            if (Integer.parseInt(userAnswer) == generateGcd) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was"
                        + " '" + generateGcd + "'.\nLet's try again, " + this.userName + "!");
                return;
            }
        }
        this.congratulation();
    }
    public void gameFive() {
        this.greetings();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (int i = 1; i <= ITERATION; i++) {
            int correctAnswer = Progression.arithmeticProgression();
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            if (Integer.parseInt(userAnswer) == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was"
                        + " '" + correctAnswer + "'.\nLet's try again, " + this.userName + "!");
                return;
            }
        }
        this.congratulation();
    }
    public void gameSix() {
        this.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= ITERATION; i++) {
            boolean isSimple = Prime.naturalNumber();
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (isSimple && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (((!isSimple) && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was"
                            + " 'no'.\nLet's try again, " + this.userName + "!");
                    return;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was"
                            + " 'yes'.\nLet's try again, " + this.userName + "!");
                    return;
                }
            }
        }
        this.congratulation();
    }
}
