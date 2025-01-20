public class PrimeNumbersUpTo10000 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // A number less than or equal to 1 is not prime
        if (number <= 1) {
            return false;
        }

        // Check divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }

        return true; // No divisors found, number is prime
    }

    public static void main(String[] args) {
        int count = 0; // Count the total numbers tested
        int primeCount = 0; // Count the prime numbers

        System.out.println("Prime numbers less than 10,000:");

        // Test numbers from 2 to 9,999
        for (int number = 2; number < 10000; number++) {
            count++; // Increment the count of numbers tested
            if (isPrime(number)) {
                System.out.print(number + " "); // Display the prime number
                primeCount++; // Increment the prime count
            }
        }

        System.out.println("\n\nTotal numbers tested: " + count);
        System.out.println("Total prime numbers found: " + primeCount);
    }
}
