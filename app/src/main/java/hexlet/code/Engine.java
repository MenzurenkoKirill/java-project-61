package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static void congratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void setUserName(String name) {
        userName = name;
    }

    public static void greetings() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scannerGreetings = new Scanner(System.in);
        String userName1 = scannerGreetings.next();
        setUserName(userName1);
        System.out.println("Hello, " + userName + "!");
    }
    public static void startGame() {
        System.out.println("Please enter the game number and press Enter.");
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        String userGameChoise = mainScanner.next();
        System.out.println("Your choice: " + userGameChoise);
        switch (userGameChoise) {
            case ("1"):
                greetings();
                break;
            case ("2"):
                Even.numberGame();
                break;
            case ("3"):
                Calc.numeracy();
                break;
            case ("4"):
                GCD.commonDivisor();
                break;
            case ("5"):
                Progression.arithmeticProgression();
                break;
            case("6"):
                Prime.naturalNumber();
                break;
            default:
        }
    }
}
