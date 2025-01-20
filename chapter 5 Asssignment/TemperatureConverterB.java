import java.util.Scanner;

public class TemperatureConverterB {

    // Method to convert Celsius to Fahrenheit
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Celsius temperature
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Call the fahrenheit method and display the result
        double fahrenheitTemperature = fahrenheit(celsius);
        System.out.printf("The Fahrenheit equivalent of %.2f°C is %.2f°F%n", celsius, fahrenheitTemperature);

        scanner.close();
    }
}
