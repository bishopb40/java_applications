import java.util.Scanner;

public class AsteriskSquar {

    // Method to display a square with a given character
    public static void squareOfAsterisks(int side, char fillCharacter) {
        for (int row = 1; row <= side; row++) { // Loop for rows
            for (int col = 1; col <= side; col++) { // Loop for columns
                System.out.print(fillCharacter); // Print the fill character
            }
            System.out.println(); // Move to the next line after printing one row
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the side length of the square
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        // Validate that the side length is positive
        if (side <= 0) {
            System.out.println("Side length must be a positive integer!");
        } else {
            // Input for the fill character
            System.out.print("Enter a character to fill the square: ");
            char fill = input.next().charAt(0);

            // Display the square of characters
            System.out.println("Here is the square of " + fill + ":");
            squareOfAsterisks(side, fill);
        }

        input.close();
    }
}
