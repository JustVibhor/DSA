package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NKnights {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(nKnights(new boolean[n][n], 0, 0, n));
    }

    static int nKnights(boolean[][] board, int row, int col, int targets) {
        int count = 0;
        if (targets == 0) {
            display(board);
            System.out.println();
            return 1;
        }

        if(row == board.length-1 && col == board[0].length) {
            return count;
        }

        if (col == board.length) {
            return nKnights(board, row + 1, 0, targets);
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += nKnights(board, row, col + 1, targets - 1);
            board[row][col] = false;
        }
        count += nKnights(board, row, col + 1, targets);


        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // case 1
        if (row > 0 && col > 1 && board[row - 1][col - 2]) {
            return false;
        }

        // case 2
        if (row > 1 && col > 0 && board[row - 2][col - 1]) {
            return false;
        }

        // case 3
        if (row > 1 && col < board[0].length - 1 && board[row - 2][col + 1]) {
            return false;
        }

        // case 4
        if (row > 0 && col < board[0].length - 2 && board[row - 1][col + 2]) {
            return false;
        }

        return true;
    }


    private static void display(boolean[][] board) {
//        List<String> ans = new ArrayList<>();
        for (boolean[] arr : board) {
//            StringBuilder temp = new StringBuilder();
            for (boolean elem : arr) {
                if (elem) {
//                    temp.append("K");
                    System.out.print("K ");
                } else {
//                    temp.append(".");
                    System.out.print("X ");
                }
            }
            System.out.println();
//            ans.add(String.valueOf(temp));
        }
//        return ans;
    }
}
