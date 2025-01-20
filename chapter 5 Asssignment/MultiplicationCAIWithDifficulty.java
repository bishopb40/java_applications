import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationCAIWithDifficulty {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Welcome to the Multiplication Practice Program!");
        while (true) {
            System.out.print("Enter difficulty level (1 for single-digit, 2 for two-digit, etc.): ");
            int difficultyLevel = input.nextInt();

            System.out.println("Answer 10 multiplication problems.\n");
            administerTest(difficultyLevel);

            System.out.print("Do you want to restart for another student? (yes/no): ");
            String continueResponse = input.next().toLowerCase();
            if (!continueResponse.equals("yes")) {
                System.out.println("Thank you for practicing! Goodbye!");
                break;
            }
        }
    }

    /**
     * Administers a test of 10 questions at the given difficulty level.
     */
    private static void administerTest(int difficultyLevel) {
        int correctCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Question %d:%n", i);
            boolean isCorrect = askQuestion(difficultyLevel);
            if (isCorrect) {
                correctCount++;
            }
        }

        System.out.printf("%nYou answered %d out of 10 questions correctly.%n", correctCount);
    }

    /**
     * Generates and asks a multiplication question based on the difficulty level.
     * Returns true if the student's answer is correct, otherwise false.
     */
    private static boolean askQuestion(int difficultyLevel) {
        int upperLimit = (int) Math.pow(10, difficultyLevel) - 1; // Calculate the maximum number based on the difficulty level
        int number1 = random.nextInt(upperLimit) + 1; // Generate random numbers based on the upper limit
        int number2 = random.nextInt(upperLimit) + 1;

        System.out.printf("How much is %d times %d?%n", number1, number2);
        int correctAnswer = number1 * number2;

        while (true) {
            System.out.print("Your answer: ");
            int studentAnswer = input.nextInt();

            if (studentAnswer == correctAnswer) {
                displayCorrectResponse();
                return true; // Correct answer
            } else {
                displayIncorrectResponse();
                // Keep looping until the correct answer is provided
            }
        }
    }

    /**
     * Displays a random correct response.
     */
    private static void displayCorrectResponse() {
        int response = random.nextInt(4) + 1; // Random number between 1 and 4
        switch (response) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
    }

    /**
     * Displays a random incorrect response.
     */
    private static void displayIncorrectResponse() {
        int response = random.nextInt(4) + 1; // Random number between 1 and 4
        switch (response) {
            case 1 -> System.out.println("No. Please try again.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
        }
    }
}
