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
    public static void startGame() throws Exception {
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
                Cli.greetings();
                break;
            case (EVEN):
                Engine.startGame(new Even());
                break;
            case (CALC):
                Engine.startGame(new Calc());
                break;
            case (GCD):
                Engine.startGame(new GCD());
                break;
            case (PROGRESSION):
                Engine.startGame(new Progression());
                break;
            case(PRIME):
                Engine.startGame(new Prime());
                break;
            default:
                System.exit(0);
        }
    }
}
