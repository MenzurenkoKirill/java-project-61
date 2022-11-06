package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;



import java.util.Scanner;

public class Menu {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
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
            case (GREET):
                Cli userGreet = new Cli();
                userGreet.greetings();
                break;
            case (EVEN):
                Even userGameTwo = new Even();
                Engine.startGame(userGameTwo);
                break;
            case (CALC):
                Calc userGameThree = new Calc();
                Engine.startGame(userGameThree);
                break;
            case (GCD):
                GCD userGameFour = new GCD();
                Engine.startGame(userGameFour);
                break;
            case (PROGRESSION):
                Progression userGameFive = new Progression();
                Engine.startGame(userGameFive);
                break;
            case(PRIME):
                Prime userGameSix = new Prime();
                Engine.startGame(userGameSix);
                break;
            default:
                System.exit(0);
        }
    }
}
