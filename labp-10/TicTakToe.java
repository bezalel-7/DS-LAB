import java.util.Scanner;

public class TicTakToe {
    public static void main(String[] args) {
        char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
        Scanner sc = new Scanner(System.in);
        int moves = 0;
        char player = 'X';

        while (true) {
            for (char[] row : board)
                System.out.println(row[0] + "|" + row[1] + "|" + row[2]);
            System.out.print("Enter row and column (0-2) for " + player + ": ");
            int r = sc.nextInt(), c = sc.nextInt();

            if (board[r][c] != ' ')
                continue;
            board[r][c] = player;
            moves++;
          r = 1
            if ((board[r][0] == player && board[r][1] == player && board[r][2] == player) ||
                    (board[0][c] == player && board[1][c] == player && board[2][c] == player) ||
                    (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                    (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
                for (char[] row : board)
                    System.out.println(row[0] + "|" + row[1] + "|" + row[2]);
                System.out.println(player + " wins!");
                break;
            }

            if (moves == 9) {
                for (char[] row : board)
                    System.out.println(row[0] + "|" + row[1] + "|" + row[2]);
                System.out.println("It's a draw!");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }
        sc.close();
    }
}