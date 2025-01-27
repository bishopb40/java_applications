import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] uniqueNumbers = new int[5]; // Array to store unique numbers
        int uniqueCount = 0; // Counter for unique numbers

        System.out.println("Enter five numbers between 10 and 100:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            // Validate the number is within the range
            if (number < 10 || number > 100) {
                System.out.println("Number out of range. Please enter a number between 10 and 100.");
                i--; // Retry the current iteration
                continue;
            }

            // Check if the number is a duplicate
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueNumbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // Add to the array if not a duplicate
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = number;
                uniqueCount++;
                System.out.println("Unique number accepted: " + number);
            } else {
                System.out.println("Duplicate number. Try again.");
            }

            // Display the complete set of unique numbers so far
            System.out.print("Unique numbers so far: ");
            for (int j = 0; j < uniqueCount; j++) {
                System.out.print(uniqueNumbers[j] + " ");
            }
            System.out.println();
        }

        scanner.close();

        // Display the final set of unique numbers
        System.out.println("\nFinal set of unique numbers:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
    }
}
