class PrintBoard {
    public static void printBoard(char[][] board) {
        System.out.println("==========");
        for (int i = 1; i <= TicTacToe.boardSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= TicTacToe.boardSize; i++) {
            for (int j = 0; j < TicTacToe.boardSize; j++) {
                System.out.print(board[i - 1][j] + " ");
            }
            System.out.println("| " + i);
        }
    }
}