package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

final class Engine {
    private static final int ITERATION = 3;
    public static void startGame(Game game) throws RuntimeException {
        System.out.print("""
        Welcome to the Brain Games!
        May I have your name? """);
        Scanner scannerGame = new Scanner(System.in);
        String userName = scannerGame.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getTask());
        for (int i = 1; i <= ITERATION; i++) {
            String[] gameData = game.getData();
            System.out.println("Question: " + gameData[0]);
            String answer = scannerGame.next();
            String gameAnswer = gameData[1];
            System.out.println("Your answer: " + answer);
            if (gameAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameAnswer + "'\n"
                            + " Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
