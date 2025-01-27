public class CommandLineSum16 {

    public static void main(String args[]) {

        double sum = 0.0; // Variable to hold the sum of double values

        // Enhanced for loop to process command-line arguments
        for (String arg : args) {
            try {
                // Convert the string argument to a double and add it to the sum
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                // Handle invalid input gracefully
                System.out.println("Invalid number: " + arg + ". Skipping...");
            }
        }

        // Display the total sum
        System.out.println("The sum of the provided double values is: " + sum);
    }
}
