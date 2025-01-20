public class PrimeNumberChecker {

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
        // Example usage: test the method with some numbers
        System.out.println("Is 7 prime? " + isPrime(7));     // true
        System.out.println("Is 10 prime? " + isPrime(10));   // false
        System.out.println("Is 1 prime? " + isPrime(1));     // false
        System.out.println("Is 29 prime? " + isPrime(29));   // true
        System.out.println("Is 100 prime? " + isPrime(100)); // false
    }
}
