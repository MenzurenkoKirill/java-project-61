package hexlet.code;

import java.util.Scanner;

public class Menu {
    private static final int GAME_GREET = 1;
    private static final int GAME_NUMBER_GAME = 2;
    private static final int GAME_NUMERACY = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_ARITHMETIC_PROGRESSION = 5;
    private static final int GAME_NATURAL_NUMBER = 6;
    public static void startGame() {
        System.out.println("Please enter the game number and press Enter.");
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int userGameChoise = mainScanner.nextInt();
        System.out.println("Your choice: " + userGameChoise);
        switch (userGameChoise) {
            case (GAME_GREET):
                Engine user = new Engine();
                user.greetings();
                break;
            case (GAME_NUMBER_GAME):
                Engine userGameTwo = new Engine();
                userGameTwo.gameTwo();
                break;
            case (GAME_NUMERACY):
                Engine userGameThree = new Engine();
                userGameThree.gameThree();
                break;
            case (GAME_GCD):
                Engine userGameFour = new Engine();
                userGameFour.gameFour();
                break;
            case (GAME_ARITHMETIC_PROGRESSION):
                Engine userGameFive = new Engine();
                userGameFive.gameFive();
                break;
            case(GAME_NATURAL_NUMBER):
                Engine userGameSix = new Engine();
                userGameSix.gameSix();
                break;
            default:
                System.exit(0);
        }
    }
}
