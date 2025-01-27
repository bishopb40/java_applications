import java.util.Scanner;

public class SalesSummary19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store sales totals: rows = products (1-5), columns = salespeople (1-4)
        double[][] sales = new double[5][4];

        System.out.println("Enter sales data for last month.");
        System.out.println("Enter -1 to stop input.");

        while (true) {
            System.out.print("Enter salesperson number (1-4): ");
            int salesperson = scanner.nextInt();
            if (salesperson == -1) break;

            System.out.print("Enter product number (1-5): ");
            int product = scanner.nextInt();
            if (product == -1) break;

            System.out.print("Enter total dollar value of product sold: ");
            double amount = scanner.nextDouble();
            if (amount == -1) break;

            // Validate input
            if (salesperson < 1 || salesperson > 4 || product < 1 || product > 5 || amount < 0) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            // Update sales total
            sales[product - 1][salesperson - 1] += amount;
        }

        // Display results
        System.out.println("\nSales Summary Table:");
        System.out.println("\tSalesperson 1\tSalesperson 2\tSalesperson 3\tSalesperson 4\tTotal");

        double[] productTotals = new double[5]; // Totals for each product
        double[] salespersonTotals = new double[4]; // Totals for each salesperson

        for (int product = 0; product < 5; product++) {
            System.out.print("Product " + (product + 1));
            double productTotal = 0;

            for (int salesperson = 0; salesperson < 4; salesperson++) {
                System.out.print("\t" + sales[product][salesperson]);
                productTotal += sales[product][salesperson];
                salespersonTotals[salesperson] += sales[product][salesperson];
            }

            productTotals[product] = productTotal;
            System.out.println("\t" + productTotal);
        }

        // Print totals for each salesperson
        System.out.print("Total");
        double grandTotal = 0;

        for (double salespersonTotal : salespersonTotals) {
            System.out.print("\t" + salespersonTotal);
            grandTotal += salespersonTotal;
        }

        System.out.println("\t" + grandTotal);
        scanner.close();
    }
}
