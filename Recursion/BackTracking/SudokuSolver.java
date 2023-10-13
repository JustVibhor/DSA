package Recursion.BackTracking;

public class SudokuSolver {

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        int n = board.length;
        int[][] newBoard = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newBoard[i][j] = board[i][j] - '0' > 0 ? board[i][j] - '0' : 0;
            }
        }
        sudoku(newBoard);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = (char) (newBoard[i][j] + '0');
            }
        }



    }

    static boolean sudoku(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 0) {
                    row = r;
                    col = c;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }

        if (emptyLeft) {
            return true;
        }

        for (int num = 1; num < 10; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (sudoku(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // check row
        for (int r = 0; r < board.length; r++) {
            if (num == board[r][col]) {
                return false;
            }
        }

        // check column
        for (int c = 0; c < board[0].length; c++) {
            if (num == board[row][c]) {
                return false;
            }
        }

        for (int r = row - row % 3; r < (row - row % 3) + 3; r++) {
            for (int c = col - col % 3; c < (col - col % 3) + 3; c++) {
                if (num == board[r][c]) {
                    return false;
                }
            }
        }

        return true;

    }

    private static void display(int[][] board) {
        for (int[] arr : board) {
            for (int i : arr) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}