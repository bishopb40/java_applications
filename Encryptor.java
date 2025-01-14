import java.util.Scanner;

public class Encryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();

        int encryptedNumber = 0;
        for (int i = 1000; i >= 1; i /= 10) {
            int digit = (number / i) % 10;
            digit = (digit + 7) % 10;
            encryptedNumber = encryptedNumber * 10 + digit;
            number %= i;
        }

        encryptedNumber = (encryptedNumber / 1000) * 1 +
                          (encryptedNumber % 10) * 1000 +
                          (encryptedNumber / 100) % 10 * 10 +
                          (encryptedNumber / 10) % 10;

        System.out.println("Encrypted number: " + encryptedNumber);
    }
}