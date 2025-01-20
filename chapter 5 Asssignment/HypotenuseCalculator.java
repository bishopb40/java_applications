import java.util.Scanner;

public class HypotenuseCalculator {

    // Method to calculate the hypotenuse of a right triangle
    public static double hypotenuse(double side1, double side2) {
        // Using the Pythagorean theorem: hypotenuse = sqrt(side1^2 + side2^2)
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side1: ");
        double side1 = scanner.nextDouble(); // Input for side1

        System.out.print("Enter the length of side2: ");
        double side2 = scanner.nextDouble(); // Input for side2

        // Calculate the hypotenuse
        double result = hypotenuse(side1, side2);

        // Display the result
        System.out.printf("The hypotenuse of the triangle with sides %.2f and %.2f is %.2f%n", side1, side2, result);

        scanner.close();
    }
}
