import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of an integer
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;   // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10;             // Remove the last digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer to reverse its digits: ");
        int number = input.nextInt();

        // Call the reverseNumber method and display the result
        int reversedNumber = reverseNumber(number);
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
