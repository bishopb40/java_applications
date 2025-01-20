import java.util.Scanner;
import java.util.Random;

public class CrapsWithWagering {

    private static final Random randomNumbers = new Random();

    // Enum for game status
    private enum Status { CONTINUE, WON, LOST }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000; // Starting bank balance

        System.out.println("Welcome to Craps with Wagering!");

        while (bankBalance > 0) {
            System.out.println("Your current bank balance is $" + bankBalance);
            
            // Get a valid wager from the player
            int wager = 0;
            do {
                System.out.print("Enter your wager: ");
                wager = input.nextInt();
                if (wager > bankBalance) {
                    System.out.println("Wager cannot exceed your bank balance. Try again.");
                }
            } while (wager > bankBalance || wager <= 0);

            // Play a round of craps
            boolean playerWon = playCraps();

            // Adjust the bank balance based on the outcome
            if (playerWon) {
                bankBalance += wager;
                System.out.println("You won! Your new bank balance is $" + bankBalance);
                displayChatter();
            } else {
                bankBalance -= wager;
                System.out.println("You lost. Your new bank balance is $" + bankBalance);
                displayChatter();

                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                    break;
                }
            }

            // Ask if the player wants to continue
            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing! Goodbye!");
        input.close();
    }

    // Method to play one round of craps
    public static boolean playCraps() {
        int myPoint = 0; // Point if no win or loss on first roll
        Status gameStatus;

        int sumOfDice = rollDice(); // First roll of the dice

        // Determine game status and point based on the first roll
        switch (sumOfDice) {
            case 7: // Win with 7 on the first roll
            case 11: // Win with 11 on the first roll
                gameStatus = Status.WON;
                break;
            case 2: // Lose with 2 on the first roll (craps)
            case 3: // Lose with 3 on the first roll (craps)
            case 12: // Lose with 12 on the first roll (craps)
                gameStatus = Status.LOST;
                break;
            default: // Did not win or lose, so remember the point
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // While game is not complete
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice(); // Roll dice again

            // Determine game status
            if (sumOfDice == myPoint) { // Win by making point
                gameStatus = Status.WON;
            } else if (sumOfDice == 7) { // Lose by rolling 7 before point
                gameStatus = Status.LOST;
            }
        }

        // Return true if the player won, false otherwise
        return gameStatus == Status.WON;
    }

    // Method to roll the dice
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6); // First die roll
        int die2 = 1 + randomNumbers.nextInt(6); // Second die roll

        int sum = die1 + die2; // Sum of die values

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    // Method to display chatter messages
    public static void displayChatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!",
            "Keep going! Luck might be on your side.",
            "One more roll could change everything!"
        };

        int randomIndex = randomNumbers.nextInt(messages.length);
        System.out.println(messages[randomIndex]);
    }
}
