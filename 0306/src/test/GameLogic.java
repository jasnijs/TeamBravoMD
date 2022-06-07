package test;


import java.util.Scanner;

public class GameLogic {

    static Scanner sc = new Scanner(System.in);

    // Method to get user input
    public static int readInt(String prompt, int userInput) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(sc.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Invalid input. Please enter a number.");
            }
        } while(input < 1 || input > userInput);
        return input;
    }

    // Method to simulate console clearing
    public static void clearConsule(){
        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }
    }

    // Method to print separations
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
            System.out.println();
    }

    // Method for heading
    public static void printHeading(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    // Method to start the game
    public static void startGame(){
        boolean chooseChar = false;
        String name;

        // Title screen
        clearConsule();
        printSeparator(30);
        System.out.println("DESTROY THE SYSTEM");
        System.out.println("TEXT GAME BY TEAM BRAVO");
        printSeparator(30);

        // Choose player
        do {
            printHeading("Which language will you pick?\n" +
                    "1. Python\n" +
                    "2. C");
            name = sc.next();
            // Asking to accept or correct
            clearConsule();
            printHeading("Play as: " + name + "?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I changed my mind.");
            int input = readInt("-> ", 2);
            clearConsule();
            if(input == 1)
                chooseChar = true;
        } while(!chooseChar);
    }



}
