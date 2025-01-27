import java.util.Scanner;

public class AirlineReservation18 {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10]; // Array to track seat assignments (false = available, true = occupied)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Airline Reservation System.");

        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (!assignSeat(seats, 0, 4)) {
                    System.out.println("First Class is full. Would you like to be placed in Economy? (1 for Yes, 2 for No): ");
                    int response = scanner.nextInt();
                    if (response == 1) {
                        if (!assignSeat(seats, 5, 9)) {
                            System.out.println("Sorry, the flight is fully booked. Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else if (choice == 2) {
                if (!assignSeat(seats, 5, 9)) {
                    System.out.println("Economy is full. Would you like to be placed in First Class? (1 for Yes, 2 for No): ");
                    int response = scanner.nextInt();
                    if (response == 1) {
                        if (!assignSeat(seats, 0, 4)) {
                            System.out.println("Sorry, the flight is fully booked. Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nCurrent Seat Assignments: ");
            for (int i = 0; i < seats.length; i++) {
                System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Occupied" : "Available"));
            }

            System.out.println("\nWould you like to make another reservation? (1 for Yes, 2 for No): ");
            int continueChoice = scanner.nextInt();
            if (continueChoice != 1) {
                break;
            }
        }

        System.out.println("Thank you for using the Airline Reservation System!");
        scanner.close();
    }

    private static boolean assignSeat(boolean[] seats, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true; // Mark the seat as occupied
                System.out.println("Seat " + (i + 1) + " assigned.");
                return true;
            }
        }
        return false; // No available seats in the specified range
    }
}
