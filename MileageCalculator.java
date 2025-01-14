import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles ,1 gallons ;
        double mpg ;
		double totalMiles = 0; 
		totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            mpg = (double) miles / gallons;
            totalMiles += miles;
            totalGallons += gallons;

            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        if (totalGallons != 0) {
            double overallMpg = totalMiles / totalGallons;
            System.out.printf("Overall miles per gallon: %.2f%n", overallMpg);
        } else {
            System.out.println("No trips recorded.");
        }
    }
}