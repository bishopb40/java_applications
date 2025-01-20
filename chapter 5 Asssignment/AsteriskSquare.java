import java.util.Scanner;

public class AsteriskSquare {

    // Method to display a solid square of asterisks
    public static void squareOfAsterisks(int side) {
        for (int row = 1; row <= side; row++) { // Loop for each row
            for (int col = 1; col <= side; col++) { // Loop for each column
                System.out.print("*"); // Print an asterisk
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square
        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();

        // Display the square of asterisks
        System.out.println("Here is the square of asterisks:");
        squareOfAsterisks(side);

        scanner.close();
    }
}
