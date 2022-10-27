package hexlet.code;

import java.util.Scanner;

public class App {
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
        App person = new App();
        person.setUserName(userName1);
        System.out.println("Hello, " + userName + "!");
    }

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        String userGameChoise = mainScanner.next();
        System.out.println("Your choice: " + userGameChoise);
        switch (userGameChoise) {
            case("1"):
                greetings();
                break;
            case("2"):
                Even.numberGame();
                break;
            default:
                return;
        }
    }
}
