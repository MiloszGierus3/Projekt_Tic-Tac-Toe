import java.util.Scanner;

class MakeMove {
    public static void makeMove(char[][] board, char symbol) {
        if (symbol == TicTacToe.player) {
            TicTacToe.starts ="C";
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj wiersz (1-3)");
                int row = scanner.nextInt() - 1;
                System.out.println("Podaj kolumnę (1-3)");
                int col = scanner.nextInt() - 1;
                if (ValidMove.validMove(row, col, board)) {
                    board[row][col] = symbol;
                    break;
                }
            }
        } else {
            TicTacToe.starts ="P";
            int[] move = BestComputerMove.bestComputerMove(board);
            board[move[0]][move[1]] = symbol;
        }
    }
}