import java.util.Arrays;

public class KnightsTour {

    private static final int BOARD_SIZE = 8;
    private static final int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static final int[][] accessibility = {
        {2, 3, 4, 4, 4, 4, 3, 2},
        {3, 4, 6, 6, 6, 6, 4, 3},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {3, 4, 6, 6, 6, 6, 4, 3},
        {2, 3, 4, 4, 4, 4, 3, 2}
    };

    public static void main(String[] args) {
        int successfulTours = 0;

        for (int startRow = 0; startRow < BOARD_SIZE; startRow++) {
            for (int startCol = 0; startCol < BOARD_SIZE; startCol++) {
                resetBoard();
                if (performKnightsTour(startRow, startCol)) {
                    successfulTours++;
                }
            }
        }

        System.out.println("Number of successful tours: " + successfulTours);
    }

    private static boolean performKnightsTour(int startRow, int startCol) {
        int moveCount = 1;
        int currentRow = startRow;
        int currentCol = startCol;

        board[currentRow][currentCol] = moveCount;

        while (moveCount < BOARD_SIZE * BOARD_SIZE) {
            int nextMove = findBestMove(currentRow, currentCol);
            if (nextMove == -1) {
                break;
            }

            currentRow += vertical[nextMove];
            currentCol += horizontal[nextMove];

            moveCount++;
            board[currentRow][currentCol] = moveCount;
            reduceAccessibility(currentRow, currentCol);
        }

        displayBoard();
        return moveCount == BOARD_SIZE * BOARD_SIZE;
    }

    private static int findBestMove(int currentRow, int currentCol) {
        int minAccessibility = Integer.MAX_VALUE;
        int bestMove = -1;

        for (int move = 0; move < horizontal.length; move++) {
            int newRow = currentRow + vertical[move];
            int newCol = currentCol + horizontal[move];

            if (isValidMove(newRow, newCol)) {
                if (accessibility[newRow][newCol] < minAccessibility) {
                    minAccessibility = accessibility[newRow][newCol];
                    bestMove = move;
                }
            }
        }

        return bestMove;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == 0;
    }

    private static void reduceAccessibility(int row, int col) {
        for (int move = 0; move < horizontal.length; move++) {
            int newRow = row + vertical[move];
            int newCol = col + horizontal[move];

            if (isValidMove(newRow, newCol)) {
                accessibility[newRow][newCol]--;
            }
        }
    }

    private static void resetBoard() {
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }
    }

    private static void displayBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
        System.out.println();
    }
}
