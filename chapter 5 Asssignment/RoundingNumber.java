import java.util.Scanner;

public class RoundingNumber {

    // Rounds to the nearest integer
    public static long roundToInteger(double number) {
        return Math.round(number);
    }

    // Rounds to the nearest tenth
    public static double roundToTenths(double number) {
        return Math.round(number * 10.0) / 10.0;
    }

    // Rounds to the nearest hundredth
    public static double roundToHundredths(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    // Rounds to the nearest thousandth
    public static double roundToThousandths(double number) {
        return Math.round(number * 1000.0) / 1000.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or type 'q' to quit): ");

            // Check if the user wants to quit
            if (scanner.hasNext("q")) {
                break;
            }

            // Process the input
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();

                // Display the original and rounded values
                System.out.printf("Original number: %.6f%n", number);
                System.out.printf("Rounded to nearest integer: %d%n", roundToInteger(number));
                System.out.printf("Rounded to nearest tenth: %.1f%n", roundToTenths(number));
                System.out.printf("Rounded to nearest hundredth: %.2f%n", roundToHundredths(number));
                System.out.printf("Rounded to nearest thousandth: %.3f%n", roundToThousandths(number));
                System.out.println();
            } else {
                System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                scanner.next(); // Clear invalid input
            }
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}
