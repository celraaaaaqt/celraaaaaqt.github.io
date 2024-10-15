import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // ANSI escape codes for coloring the output
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        int guess = 0;

        // Displaying game title with ASCII art
        System.out.println(ANSI_PURPLE + "=========================================");
        System.out.println("|    Welcome to the Number Guessing Game   |");
        System.out.println("=========================================" + ANSI_RESET);

        System.out.println(ANSI_CYAN + "I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?" + ANSI_RESET);

        while (guess != randomNumber) {
            System.out.print(ANSI_YELLOW + "Enter your guess: " + ANSI_RESET);
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < randomNumber) {
                System.out.println(ANSI_RED + "Too low! Try again." + ANSI_RESET);
            } else if (guess > randomNumber) {
                System.out.println(ANSI_RED + "Too high! Try again." + ANSI_RESET);
            } else {
                System.out.println(ANSI_GREEN + "Congratulations! You guessed the number in " 
                        + numberOfGuesses + " attempts." + ANSI_RESET);
            }
        }

        // End of game design
        System.out.println(ANSI_PURPLE + "=========================================");
        System.out.println("|           Thank you for playing!        |");
        System.out.println("=========================================" + ANSI_RESET);

        scanner.close();
    }
}
