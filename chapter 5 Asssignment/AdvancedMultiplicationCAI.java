import java.security.SecureRandom;
import java.util.Scanner;

public class AdvancedMultiplicationCAI {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Advanced Multiplication Practice Program!");
        System.out.println("Answer 10 questions, and we’ll evaluate your performance.\n");

        while (true) {
            administerTest();
            System.out.print("Do you want to restart for another student? (yes/no): ");
            String continueResponse = input.next().toLowerCase();
            if (!continueResponse.equals("yes")) {
                System.out.println("Thank you for practicing! Goodbye!");
                break;
            }
        }
    }

    /**
     * Administers a test of 10 questions, evaluates performance, and provides feedback.
     */
    private static void administerTest() {
        int correctCount = 0;
        int incorrectCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Question %d:%n", i);
            boolean isCorrect = askQuestion();
            if (isCorrect) {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }

        evaluatePerformance(correctCount, incorrectCount);
    }

    /**
     * Generates and asks a multiplication question, and returns whether the student's response is correct.
     */
    private static boolean askQuestion() {
        int number1 = random.nextInt(9) + 1; // Random integer between 1 and 9
        int number2 = random.nextInt(9) + 1;

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

    /**
     * Evaluates the student's performance and provides feedback.
     */
    private static void evaluatePerformance(int correctCount, int incorrectCount) {
        int totalQuestions = correctCount + incorrectCount;
        double percentageCorrect = (correctCount / (double) totalQuestions) * 100;

        System.out.printf("%nResults:%n");
        System.out.printf("Correct Answers: %d%n", correctCount);
        System.out.printf("Incorrect Answers: %d%n", incorrectCount);
        System.out.printf("Percentage Correct: %.2f%%%n", percentageCorrect);

        if (percentageCorrect >= 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help.");
        }
        System.out.println();
    }
}
