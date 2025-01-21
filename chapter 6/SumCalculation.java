import java.util.Scanner;

public class SumCalculation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum2to6 = 0;
        for (int i = 1; i <= 5; i++) {
            sum2to6 += numbers[i];
        }
		
        int sum7to9 = 0;
        for (int i = 6; i <= 8; i++) {
            sum7to9 += numbers[i];
        }
		
        int result = sum2to6 - sum7to9;

        System.out.println("The sum of the 2nd to 6th elements is: " + sum2to6);
        System.out.println("The sum of the 7th to 9th elements is: " + sum7to9);
        System.out.println("The result of subtracting the two sums is: " + result);

    }
}
