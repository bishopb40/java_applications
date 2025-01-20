import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberWithFeedback {

    // Method to play the guessing game
    public static void playGame() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int numberToGuess = random.nextInt(1000) + 1; // Random number between 1 and 1000
        int guess = 0;
        int attempts = 0; // Track the number of guesses

        System.out.println("Guess a number between 1 and 1000.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                System.out.println("It took you " + attempts + " attempts.");

                // Provide feedback based on the number of attempts
                if (attempts <= 10) {
                    if (attempts == 10) {
                        System.out.println("Aha! You know the secret!");
                    } else {
                        System.out.println("Either you know the secret or you got lucky!");
                    }
                } else {
                    System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number game!");

        while (playAgain) {
            playGame();

            // Ask if the user wants to play again
            System.out.print("Would you like to play again? (yes/no): ");
            String response = input.next().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing! Goodbye!");
            }
        }

        input.close();
    }
}
