import java.util.Scanner;

public class ParkingCharges {

    // Method to calculate the parking charges for a customer
    public static double calculateCharges(double hours) {
        double charge;
        
        if (hours <= 3) {
            charge = 2.00; // Minimum fee for up to 3 hours
        } else if (hours <= 24) {
            charge = 2.00 + 0.50 * Math.ceil(hours - 3); // Additional charges for hours exceeding 3
            if (charge > 10.00) {
                charge = 10.00; // Maximum charge is $10 for 24 hours
            }
        } else {
            throw new IllegalArgumentException("Hours cannot exceed 24.");
        }
        
        return charge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0; // To keep track of total receipts for the day
        int customerCount = 1; // To identify each customer
        
        while (true) {
            System.out.print("Enter hours parked for customer " + customerCount + " (or -1 to quit): ");
            double hours = scanner.nextDouble();
            
            if (hours == -1) {
                break; // Exit the loop if the user enters -1
            }
            
            if (hours < 0 || hours > 24) {
                System.out.println("Invalid input. Hours must be between 0 and 24.");
                continue;
            }
            
            // Calculate charges for the current customer
            double charge = calculateCharges(hours);
            System.out.printf("Charge for customer %d: $%.2f%n", customerCount, charge);
            
            // Add the charge to the total receipts
            totalReceipts += charge;
            customerCount++;
        }
        
        // Display the total receipts for the day
        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        scanner.close();
    }
}
