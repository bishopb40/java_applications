import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Fahrenheit temperature
        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Call the celsius method and display the result
        double celsiusTemperature = celsius(fahrenheit);
        System.out.printf("The Celsius equivalent of %.2f°F is %.2f°C%n", fahrenheit, celsiusTemperature);

        scanner.close();
    }
}
