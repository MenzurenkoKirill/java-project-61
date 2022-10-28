package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {
    public static void arithmeticProgression() {
        Engine.greetings();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (int i = 1; i <= 3; i++) {
            int number1 = (int) (Math.random() * 100) + 1;
            int number2 = (int) (Math.random() * 100) + 1;
            int progressionLength = (int) (Math.random() * 6) + 5;
            int randomIndex = (int) (Math.random() * (progressionLength - 2)) + 2;
            int[] arrayProgression = new int[progressionLength];
            arrayProgression[0] = number1;
            arrayProgression[1] = number2;
            int d = number2 - number1;
            for (int j = 2; j <= arrayProgression.length - 1; j++) {
                arrayProgression[j] = arrayProgression[0] + (j * d);
            }
            int correctAnswer = arrayProgression[randomIndex];
            String[] arrayWithSpace = new String[arrayProgression.length];
            for (int c = 0; c <= arrayProgression.length - 1; c++) {
                arrayWithSpace[c] = Integer.toString(arrayProgression[c]);
            }
            arrayWithSpace[randomIndex] = "..";
            String array = String.join(" ", arrayWithSpace);
            System.out.println("Question: " + array);
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            if (Integer.parseInt(userAnswer) == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was"
                        + " '" + correctAnswer + "'.\nLet's try again, " + Engine.userName + "!");
                return;
            }
        }
        Engine.congratulation();
    }
}

