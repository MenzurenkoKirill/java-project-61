package hexlet.code;

import java.util.Scanner;

final class Engine {
    private static final int ITERATION = 3;
    private String userName;


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
    public static void startGame(Game game) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scannerGreetings = new Scanner(System.in);
        String userName = scannerGreetings.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getTask());
        Scanner scannerGame = new Scanner(System.in);
        for (int i = 1; i <= ITERATION; i++) {
            String[] gameArray = game.getData();
            System.out.println(gameArray[0]);
            String answer = scannerGame.next();
            String gameAnswer = gameArray[1];
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
