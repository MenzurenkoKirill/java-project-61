package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scannerGreetings = new Scanner(System.in);
        String userName = scannerGreetings.next();
        System.out.println("Hello, " + userName + "!");
    }
}

