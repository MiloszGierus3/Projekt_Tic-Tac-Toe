class Minimax {
    public static int minimax(boolean maximization, char[][] board) {
        char winner = CheckWin.checkWin(board);
        if (winner == TicTacToe.computer) {
            return 1;
        } else if (winner == TicTacToe.player) {
            return -1;
        } else if (IsFull.isFull(board)) {
            return 0;
        } else if (maximization) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < TicTacToe.boardSize; i++) {
                for (int j = 0; j < TicTacToe.boardSize; j++) {
                    if (board[i][j] == '-') {
                        board[i][j] = TicTacToe.computer;
                        int score = minimax(false, board);
                        board[i][j] = '-';
                        bestScore = Math.max(bestScore, score);
                    }
                }
            }
            return bestScore;
        } else {
            int worstScore = Integer.MAX_VALUE;
            for (int i = 0; i < TicTacToe.boardSize; i++) {
                for (int j = 0; j < TicTacToe.boardSize; j++) {
                    if (board[i][j] == '-') {
                        board[i][j] = TicTacToe.player;
                        int score = minimax(true, board);
                        board[i][j] = '-';
                        worstScore = Math.min(worstScore, score);
                    }
                }
            }
            return worstScore;
        }
    }
}