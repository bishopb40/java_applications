import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter employee " + i + " name: ");
            String name = input.next();

            System.out.print("Enter hours worked for " + name + ": ");
            double hoursWorked = input.nextDouble();

            System.out.print("Enter hourly rate for " + name + ": ");
            double hourlyRate = input.nextDouble();

            double regularPay;
			double overtimePay;
			double grossPay;

            if (hoursWorked <= 40) {
                regularPay = hoursWorked * hourlyRate;
                overtimePay = 0;
            } else {
                regularPay = 40 * hourlyRate;
                overtimePay = (hoursWorked - 40) * hourlyRate * 1.5;
            }

            grossPay = regularPay + overtimePay;

            System.out.printf("%s's gross pay: $%.2f%n", name, grossPay);
        }

        input.close();
    }
}