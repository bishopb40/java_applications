import java.util.Random;

public class DiceRollSimulation17 {
    public static void main(String[] args) {
        Random random = new Random(); // Random object to roll dice
        int[] frequency = new int[13]; // Array to tally sums (index 2 to 12)
        int rolls = 36000000; // Number of rolls

        // Simulate rolling the dice
        for (int i = 0; i < rolls; i++) {
            int die1 = random.nextInt(6) + 1; // Roll first die (1 to 6)
            int die2 = random.nextInt(6) + 1; // Roll second die (1 to 6)
            int sum = die1 + die2; // Calculate the sum

            frequency[sum]++; // Increment the count for the sum
        }

        // Display the results in tabular format
        System.out.println("Sum\tFrequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%d\t%d%n", sum, frequency[sum]);
        }
    }
}
