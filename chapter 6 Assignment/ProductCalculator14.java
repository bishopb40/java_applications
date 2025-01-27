public class ProductCalculator14 {
	

    // Method to calculate the product of a series of integers using varargs
    public static int product(int... numbers) {
        int result = 1; // Initialize product to 1
        for (int number : numbers) {
            result *= number; // Multiply each number
        }
        return result;
    }

    public static void main(String[] args) {
        // Test the product method with different numbers of arguments
        System.out.println("Product of 2, 3, 4: " + product(2, 3, 4)); // Output: 24
        System.out.println("Product of 5, 6: " + product(5, 6));       // Output: 30
        System.out.println("Product of 7, 8, 9, 10: " + product(7, 8, 9, 10)); // Output: 5040
        System.out.println("Product of 1, 2, 3, 4, 5: " + product(1, 2, 3, 4, 5)); // Output: 120
        System.out.println("Product of no numbers: " + product());     // Output: 1 (product of an empty set)
    }
}
