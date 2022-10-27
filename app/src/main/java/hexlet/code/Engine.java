package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static void congratulation() {
        System.out.println("Congratulations, " + userName + "!");
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public static void greetings() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scannerGreetings = new Scanner(System.in);
        String userName1 = scannerGreetings.next();
        Engine person = new Engine();
        person.setUserName(userName1);
        System.out.println("Hello, " + userName + "!");
    }
    public static void startGame() {
        System.out.println("Please enter the game number and press Enter.");
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
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
            case ("4"):
                GCD.commonDivisor();
            case ("0"):
                return;
            default:
                return;
        }
    }
}
