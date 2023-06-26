import java.util.Scanner;

public class TicTacToe {
    public static String starts;
    public static final char computer = 'O';
    public static final char player = 'X';
    public static int boardSize = 3;

    public static void main(String[] args) {
        char[][] board = CreateBoard.createBoard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kto zaczyna? [C-Computer / P-Player] ");
        starts = String.valueOf(scanner.nextLine().toUpperCase().charAt(0));
        while(!starts.equals("P")  && !starts.equals("C")){
            System.out.println("Źle wprowadzone dane!");
            starts = String.valueOf(scanner.nextLine().toUpperCase().charAt(0));
        }

            while (true) {
                PrintBoard.printBoard(board);
                if (starts.equals("P")) {
                    MakeMove.makeMove(board, player);
                } else {
                    MakeMove.makeMove(board, computer);
                }
                char winner = CheckWin.checkWin(board);
                if (winner != 'N') {
                    PrintBoard.printBoard(board);
                    if (winner == 'P') {
                        System.out.println("Brawo! Wygrałeś!");
                    } else {
                        System.out.println("Zwyciężył komputer.");
                    }
                    break;
                } else if (IsFull.isFull(board)) {
                    PrintBoard.printBoard(board);
                    System.out.println("Remis!");
                    break;
                }
            }

    }
}

