import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        // Define the salary ranges
        int[] salaryRanges = new int[9]; // Array to count the number of salespeople in each range

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input number of salespeople
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();

        // Loop to process each salesperson's gross sales
        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter gross sales for salesperson " + (i + 1) + ": ");
            double grossSales = scanner.nextDouble();

            // Calculate weekly earnings
            int salary = (int) (200 + 0.09 * grossSales);

            // Determine the appropriate salary range
            if (salary >= 200 && salary <= 299) {
                salaryRanges[0]++;
            } else if (salary >= 300 && salary <= 399) {
                salaryRanges[1]++;
            } else if (salary >= 400 && salary <= 499) {
                salaryRanges[2]++;
            } else if (salary >= 500 && salary <= 599) {
                salaryRanges[3]++;
            } else if (salary >= 600 && salary <= 699) {
                salaryRanges[4]++;
            } else if (salary >= 700 && salary <= 799) {
                salaryRanges[5]++;
            } else if (salary >= 800 && salary <= 899) {
                salaryRanges[6]++;
            } else if (salary >= 900 && salary <= 999) {
                salaryRanges[7]++;
            } else {
                salaryRanges[8]++; // $1000 and over
            }
        }

        // Close the scanner
        scanner.close();

        // Display the results in tabular format
        System.out.println("\nSalary Range\tNumber of Salespeople");
        System.out.println("$200-299\t\t" + salaryRanges[0]);
        System.out.println("$300-399\t\t" + salaryRanges[1]);
        System.out.println("$400-499\t\t" + salaryRanges[2]);
        System.out.println("$500-599\t\t" + salaryRanges[3]);
        System.out.println("$600-699\t\t" + salaryRanges[4]);
        System.out.println("$700-799\t\t" + salaryRanges[5]);
        System.out.println("$800-899\t\t" + salaryRanges[6]);
        System.out.println("$900-999\t\t" + salaryRanges[7]);
        System.out.println("$1000 and over\t" + salaryRanges[8]);
    }
}
