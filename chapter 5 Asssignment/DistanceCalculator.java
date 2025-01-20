import java.util.Scanner;

public class DistanceCalculator {

    // Method to calculate the distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Distance Calculator!");

        // Input coordinates for the first point
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = input.nextDouble();

        // Input coordinates for the second point
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = input.nextDouble();

        // Calculate the distance
        double result = distance(x1, y1, x2, y2);

        // Display the result
        System.out.printf("The distance between the points (%.2f, %.2f) and (%.2f, %.2f) is %.2f.%n", 
                          x1, y1, x2, y2, result);

        input.close();
    }
}
