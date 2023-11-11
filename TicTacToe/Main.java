package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        Scanner scanner = new Scanner(System.in);
        boolean isGameOver = false;
        int count = 0;

        while (!isGameOver) {
            printBoard(board);
            System.out.println("Player: " + player + " enter: ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board[row][col] == ' ') {
                board[row][col] = (count % 2) == 0 ? 'X' : 'O';
                count++;
                isGameOver = hasWon(row, col);
            } else {
                System.out.println(row + ", " + col + " Already filled");
            }
        }

    }

    private static boolean hasWon(int row, int col) {
        return false;
    }

    private static void printBoard(char[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                System.out.print(board[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
