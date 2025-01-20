import java.util.Scanner;

public class MultipleChecker {

    // Method to check if the second number is a multiple of the first
    public static boolean isMultiple(int first, int second) {
        return second % first == 0; // Returns true if the remainder is 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        System.out.println("Enter pairs of integers to check if the second is a multiple of the first.");

        do {
            // Input for the first number
            System.out.print("Enter the first integer: ");
            int first = scanner.nextInt();

            // Input for the second number
            System.out.print("Enter the second integer: ");
            int second = scanner.nextInt();

            // Check if the second number is a multiple of the first
            if (isMultiple(first, second)) {
                System.out.printf("%d is a multiple of %d.%n", second, first);
            } else {
                System.out.printf("%d is not a multiple of %d.%n", second, first);
            }

            // Ask if the user wants to input another pair
            System.out.print("Do you want to check another pair? (yes/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("yes"));

        System.out.println("Program ended.");
        scanner.close();
    }
}
