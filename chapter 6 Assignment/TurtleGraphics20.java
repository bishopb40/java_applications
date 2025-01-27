import java.util.Arrays;

public class TurtleGraphics20 {

    private static final int FLOOR_SIZE = 20;
    private static final int[][] floor = new int[FLOOR_SIZE][FLOOR_SIZE];
    private static int currentRow = 0;
    private static int currentCol = 0;
    private static boolean penDown = false;
    private static int direction = 0; // 0 = right, 1 = down, 2 = left, 3 = up

    public static void main(String[] args) {
        int[] commands = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9};
        processCommands(commands);
    }

    private static void processCommands(int[] commands) {
        for (int command : commands) {
            switch (command) {
                case 1:
                    penDown = false;
                    break;
                case 2:
                    penDown = true;
                    break;
                case 3:
                    turnRight();
                    break;
                case 4:
                    turnLeft();
                    break;
                case 5:
                    moveForward(getSteps());
                    break;
                case 6:
                    displayFloor();
                    break;
                case 9:
                    System.out.println("Turtle graphics program terminated.");
                    return;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }
    }

    private static void turnRight() {
        direction = (direction + 1) % 4;
    }

    private static void turnLeft() {
        direction = (direction + 3) % 4;
    }

    private static void moveForward(int steps) {
        for (int i = 0; i < steps; i++) {
            switch (direction) {
                case 0: // Right
                    if (currentCol + 1 < FLOOR_SIZE) currentCol++;
                    break;
                case 1: // Down
                    if (currentRow + 1 < FLOOR_SIZE) currentRow++;
                    break;
                case 2: // Left
                    if (currentCol - 1 >= 0) currentCol--;
                    break;
                case 3: // Up
                    if (currentRow - 1 >= 0) currentRow--;
                    break;
            }

            if (penDown) {
                floor[currentRow][currentCol] = 1;
            }
        }
    }

    private static void displayFloor() {
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }

    private static int getSteps() {
        // Simulate reading steps from commands (default to 12 for testing).
        return 12;
    }
}
