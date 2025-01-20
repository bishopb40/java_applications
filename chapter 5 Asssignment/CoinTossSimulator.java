import java.util.Scanner;
import java.util.Random;

public class CoinTossSimulator {

    // Enum to represent the two sides of a coin
    public enum Coin {
        HEADS, TAILS
    }

    // Method to simulate a coin flip
    public static Coin flip() {
        Random random = new Random();
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0; // Count of HEADS
        int tailsCount = 0; // Count of TAILS
        boolean exit = false;

        System.out.println("Coin Toss Simulator");
        System.out.println("1. Toss Coin");
        System.out.println("2. Display Results");
        System.out.println("3. Exit");

        while (!exit) {
            System.out.print("\nChoose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Simulate a coin toss
                    Coin result = flip();
                    if (result == Coin.HEADS) {
                        headsCount++;
                        System.out.println("Result: HEADS");
                    } else {
                        tailsCount++;
                        System.out.println("Result: TAILS");
                    }
                    break;

                case 2:
                    // Display results
                    System.out.println("\nResults:");
                    System.out.println("HEADS: " + headsCount);
                    System.out.println("TAILS: " + tailsCount);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option! Please choose 1, 2, or 3.");
                    break;
            }
        }

        input.close();
    }
}
