import java.util.Scanner;

public class GCDCalculator {

    // Method to calculate the GCD using Euclid's algorithm
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Call the gcd method and display the result
        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
