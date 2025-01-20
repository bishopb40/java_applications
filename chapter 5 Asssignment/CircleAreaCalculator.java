import java.util.Scanner;

public class CircleAreaCalculator {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius; // Formula for the area of a circle
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Validate that the radius is non-negative
        if (radius < 0) {
            System.out.println("Radius cannot be negative. Please enter a positive value.");
        } else {
            // Calculate and display the area
            double area = circleArea(radius);
            System.out.printf("The area of the circle with radius %.2f is %.2f.%n", radius, area);
        }

        input.close();
    }
}
