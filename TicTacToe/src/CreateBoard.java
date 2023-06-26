class CreateBoard {
    public static char[][] createBoard() {
        char[][] board = new char[TicTacToe.boardSize][TicTacToe.boardSize];
        for (int i = 0; i < TicTacToe.boardSize; i++) {
            for (int j = 0; j < TicTacToe.boardSize; j++) {
                board[i][j] = '-';
            }
        }
        return board;
    }
}