import java.util.Scanner;

public class EvenOddChecker {

    // Method to determine if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0; // Returns true if the remainder is 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        System.out.println("Enter integers to check if they are even or odd.");

        do {
            // Input for the integer
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Check if the number is even or odd
            if (isEven(number)) {
                System.out.printf("%d is even.%n", number);
            } else {
                System.out.printf("%d is odd.%n", number);
            }

            // Ask if the user wants to input another number
            System.out.print("Do you want to check another number? (yes/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("yes"));

        System.out.println("Program ended.");
        scanner.close();
    }
}
