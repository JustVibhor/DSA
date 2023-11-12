package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean isGameOver = false;
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (!isGameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter: ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = (count % 2) == 0 ? 'X' : 'O';
                count++;
                isGameOver = hasWon(board, player);
            } else {
                System.out.println(row + ", " + col + " Already filled");
            }
        }

        System.out.println("The Winner is " + player);

    }

    private static boolean hasWon(char[][] board, char player) {

        // cover horizontal answers
        for(int i=0; i<board.length; i++) {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // cover vertical answers
        for (int i=0; i<board.length; i++) {
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        boolean ans = false;

        for(int i=0, j=0; i<board.length && j<board[0].length; i++, j++) {
            if(board[i][j] == player) {
                ans = true;
            } else {
                ans = false;
            }

            if(board[i][board[0].length - j - 1] == player) {
                ans = true;
            } else {
                ans = false;
            }
        }

        return ans;

    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" | " + board[i][j]);
            }
            System.out.println(" |");
        }
    }
}
