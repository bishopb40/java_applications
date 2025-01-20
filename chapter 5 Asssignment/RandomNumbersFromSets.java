import java.util.Random;

public class RandomNumbersFromSets {
    public static void main(String[] args) {
        Random random = new Random();

        // a) 2, 4, 6, 8, 10
        int n1 = 2 + 2 * random.nextInt(5); // Generates 0–4 and maps to 2, 4, 6, 8, 10
        System.out.println("a) Random number from set {2, 4, 6, 8, 10}: " + n1);

        // b) 3, 5, 7, 9, 11
        int n2 = 3 + 2 * random.nextInt(5); // Generates 0–4 and maps to 3, 5, 7, 9, 11
        System.out.println("b) Random number from set {3, 5, 7, 9, 11}: " + n2);

        // c) 6, 10, 14, 18, 22
        int n3 = 6 + 4 * random.nextInt(5); // Generates 0–4 and maps to 6, 10, 14, 18, 22
        System.out.println("c) Random number from set {6, 10, 14, 18, 22}: " + n3);
    }
}
