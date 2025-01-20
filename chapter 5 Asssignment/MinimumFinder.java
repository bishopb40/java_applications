import java.util.Scanner;

public class MinimumFinder {

    // Method to find the smallest of three floating-point numbers
    public static double minimum3(double num1, double num2, double num3) {
        // Use Math.min to find the smallest of the three numbers
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three floating-point numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        // Call the minimum3 method to find the smallest number
        double smallest = minimum3(number1, number2, number3);

        // Display the result
        System.out.printf("The smallest number among %.2f, %.2f, and %.2f is %.2f%n", 
                          number1, number2, number3, smallest);

        scanner.close();
    }
}
