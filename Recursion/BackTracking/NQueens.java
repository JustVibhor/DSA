package Recursion.BackTracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        nQueens(board, 0, "");
    }

    static void nQueens(boolean[][] board, int row, String p) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }

        for (int c = 0; c < board[0].length; c++) {
            if (!checkQueen(board, row, c)) {
                board[row][c] = true;
                nQueens(board, row + 1, p + "Q");
                board[row][c] = false;
            }
        }


    }

    private static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean elem : arr) {
                if (elem) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean checkQueen(boolean[][] board, int row, int col) {
        // Straight up
        for (int r = 0; r < row; r++) {
            if (board[r][col]) {
                return true;
            }
        }

        // Left Diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return true;
            }
        }

        // Right Diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return true;
            }
        }

        return false;
    }

}
