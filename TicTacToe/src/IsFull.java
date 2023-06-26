class IsFull {
    public static boolean isFull(char[][] board) {
        for (int i = 0; i < TicTacToe.boardSize; i++) {
            for (int j = 0; j < TicTacToe.boardSize; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}