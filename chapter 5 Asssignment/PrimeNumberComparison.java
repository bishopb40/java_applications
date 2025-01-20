public class PrimeNumberComparison {

    // Method 1: Check divisors up to n/2
    public static boolean isPrimeHalf(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method 2: Check divisors up to sqrt(n)
    public static boolean isPrimeSqrt(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int upperLimit = 10000; // Limit to test primes
        int countHalf = 0;      // Divisor checks using Method 1
        int countSqrt = 0;      // Divisor checks using Method 2

        System.out.println("Primes less than " + upperLimit + " using both methods:\n");

        System.out.println("Method 1 (n/2 check):");
        for (int number = 2; number < upperLimit; number++) {
            countHalf++;
            if (isPrimeHalf(number)) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n\nMethod 2 (sqrt(n) check):");
        for (int number = 2; number < upperLimit; number++) {
            countSqrt++;
            if (isPrimeSqrt(number)) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n\nPerformance Comparison:");
        System.out.println("Total divisor checks using Method 1 (n/2): " + countHalf);
        System.out.println("Total divisor checks using Method 2 (sqrt(n)): " + countSqrt);
    }
}
