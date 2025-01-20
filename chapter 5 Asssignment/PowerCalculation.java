import java.util.Scanner;

public class PowerCalculation {

    // Method to calculate base^exponent
    public static int integerPower(int base, int exponent) {
        int result = 1;

        // Multiply the base by itself 'exponent' times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (integer): ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent (positive integer): ");
        int exponent = scanner.nextInt();

        // Validate that the exponent is a positive, nonzero integer
        if (exponent <= 0) {
            System.out.println("Error: The exponent must be a positive, nonzero integer.");
        } else {
            // Call the integerPower method and display the result
            int result = integerPower(base, exponent);
            System.out.printf("%d^%d = %d%n", base, exponent, result);
        }

        scanner.close();
    }
}
