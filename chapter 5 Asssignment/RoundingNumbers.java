import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a double value (or type 'x' to quit): ");
            
            if (scanner.hasNext("x")) {
                break;
            }
            
            if (scanner.hasNextDouble()) {
                double originalNum = scanner.nextDouble();
                long roundedNum = Math.round(originalNum); 
                
                
                System.out.printf("Original number: %.2f, Rounded number: %d%n", originalNum, roundedNum);
            } else {
                System.out.println("Invalid input. Please enter a double value or 'x' to quit.");
                scanner.next(); 
            }
        }
        
        System.out.println("Program terminated.");
        scanner.close();
    }
}
