package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(nQueens(board, 0, ""));
        }


    static int countQueens(boolean[][] board, int row) {
        int count = 0;
        if(row == board.length) {
            return 1;
        }

        for(int c=0; c<board[0].length; c++) {
            if(!checkQueen(board, row, c)) {
                board[row][c] = true;
                count += countQueens(board, row+1);
                board[row][c] = false;
            }
        }
        return count;
    }

    static List<List<String>> nQueens(boolean[][] board, int row, String p) {
        List<List<String>> list = new ArrayList<>();
        if (row == board.length) {
            list.add(display(board));
            return list;
        }

        for (int c = 0; c < board[0].length; c++) {
            if (!checkQueen(board, row, c)) {
                board[row][c] = true;
                list.addAll(nQueens(board, row + 1, p + "Q"));
                board[row][c] = false;
            }
        }

        return list;

    }

    private static List<String> display(boolean[][] board) {
        List<String> ans = new ArrayList<>();
        for (boolean[] arr : board) {
            StringBuilder temp = new StringBuilder();
            for (boolean elem : arr) {
                if (elem) {
                    temp.append("Q");
                } else {
                    temp.append(".");
                }
            }
            ans.add(String.valueOf(temp));
        }
        return ans;
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
