import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random random = new Random();

        // a) 1 ≤ n ≤ 2
        int n1 = 1 + random.nextInt(2); // Generates 1 or 2
        System.out.println("a) 1 ≤ n ≤ 2: " + n1);

        // b) 1 ≤ n ≤ 100
        int n2 = 1 + random.nextInt(100); // Generates 1 to 100
        System.out.println("b) 1 ≤ n ≤ 100: " + n2);

        // c) 0 ≤ n ≤ 9
        int n3 = random.nextInt(10); // Generates 0 to 9
        System.out.println("c) 0 ≤ n ≤ 9: " + n3);

        // d) 1000 ≤ n ≤ 1112
        int n4 = 1000 + random.nextInt(113); // Generates 1000 to 1112
        System.out.println("d) 1000 ≤ n ≤ 1112: " + n4);

        // e) -1 ≤ n ≤ 1
        int n5 = -1 + random.nextInt(3); // Generates -1, 0, or 1
        System.out.println("e) -1 ≤ n ≤ 1: " + n5);

        // f) -3 ≤ n ≤ 11
        int n6 = -3 + random.nextInt(15); // Generates -3 to 11
        System.out.println("f) -3 ≤ n ≤ 11: " + n6);
    }
}
