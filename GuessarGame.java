package guessargame;

import java.util.Random;
import java.util.Scanner;

public class GuessarGame {
	public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Random random = new Random();
        int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 10; // Maximum number of attempts allowed
        boolean won = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Take a guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low! Try again.");
            } else if (guess > number) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                won = true;
                break;
            }
        }

        if (!won) {
            System.out.println("Sorry, you did not guess the number. The correct number was: " + number);
        }

        scanner.close();
    }

}
