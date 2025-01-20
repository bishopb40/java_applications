import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationCAI {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Practice Program!");
        System.out.println("You can type your answer to the multiplication problems.");
        System.out.println("Let's get started!\n");

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
     * Generates and asks a multiplication question.
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
                System.out.println("Very good!\n");
                break; // Exit the loop for this question
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
}
