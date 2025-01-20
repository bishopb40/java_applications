public class PerfectNumberFinder {

    // Method to determine if a number is a perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Find all factors of the number (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of factors equals the number
        return sum == number;
    }

    // Method to find and display perfect numbers in a given range
    public static void findPerfectNumbers(int start, int end) {
        System.out.printf("Perfect numbers between %d and %d:\n", start, end);

        for (int number = start; number <= end; number++) {
            if (isPerfect(number)) {
                System.out.printf("%d is a perfect number. Factors: ", number);
                displayFactors(number);
                System.out.println();
            }
        }
    }

    // Method to display the factors of a perfect number
    public static void displayFactors(int number) {
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Find and display perfect numbers between 1 and 1000
        findPerfectNumbers(1, 1000);

        // Uncomment the following line to test larger ranges
        // findPerfectNumbers(1, 10000);
    }
}
