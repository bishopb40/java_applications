import java.util.Scanner;

public class IntegerQuotient {

    // Method to calculate the integer part of the quotient
    public static int calculateQuotient(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b; // Perform integer division
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input integers a and b
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        try {
            // Call the method and display the result
            int quotient = calculateQuotient(a, b);
            System.out.printf("The integer part of the quotient when %d is divided by %d is: %d%n", a, b, quotient);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
