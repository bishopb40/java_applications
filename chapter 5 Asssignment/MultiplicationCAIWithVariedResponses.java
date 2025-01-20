import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationCAIWithVariedResponses {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Enhanced Multiplication Practice Program!");
        System.out.println("You will receive different feedback after each response.");
        System.out.println("Let's begin!\n");

        while (true) {
            askQuestion();
            System.out.print("Do you want to practice more? (yes/no): ");
            String continueResponse = input.next().toLowerCase();
            if (!continueResponse.equals("yes")) {
                System.out.println("Thanks for practicing! Goodbye!");
                break;
            }
        }
    }

    /**
     * Generates and asks a multiplication question with varied feedback.
     */
    private static void askQuestion() {
        int number1 = random.nextInt(9) + 1; // Generate a random integer between 1 and 9
        int number2 = random.nextInt(9) + 1;

        System.out.printf("How much is %d times %d?%n", number1, number2);

        int correctAnswer = number1 * number2;

        while (true) {
            System.out.print("Your answer: ");
            int studentAnswer = input.nextInt();

            if (studentAnswer == correctAnswer) {
                displayCorrectResponse();
                break; // Exit the loop for this question
            } else {
                displayIncorrectResponse();
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
