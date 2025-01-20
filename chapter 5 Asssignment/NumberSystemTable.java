public class NumberSystemTable {

    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
        System.out.println("--------------------------------------------------------");

        // Generate and print the table
        for (int decimal = 1; decimal <= 256; decimal++) {
            // Convert to different number systems
            String binary = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            String hex = Integer.toHexString(decimal).toUpperCase(); // Convert to uppercase for consistency

            // Print the row
            System.out.printf("%-10d %-10s %-10s %-10s%n", decimal, binary, octal, hex);
        }
    }
}
