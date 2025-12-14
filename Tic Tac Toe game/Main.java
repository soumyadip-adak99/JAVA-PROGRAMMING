import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

        char player = 'X';
        boolean gameOver = false;
        int moves = 0;

        Scanner scan = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter row and column (0-2): ");

            int row = scan.nextInt();
            int col = scan.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;
                moves++;

                gameOver = haveWon(board, player);

                if (gameOver) {
                    printBoard(board);
                    System.out.println("Player " + player + " has won");
                } else if (moves == 9) {
                    printBoard(board);
                    System.out.println("Game is a draw");
                    break;
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Cell already occupied. Try again.");
            }
        }

        scan.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean haveWon(char[][] board, char player) {

        // check row
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) {
                return true;
            }
        }

        // check col
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // check for diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}
