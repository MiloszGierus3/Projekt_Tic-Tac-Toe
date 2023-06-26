class BestComputerMove {
    public static int[] bestComputerMove(char[][] board) {
        int bestScore = Integer.MIN_VALUE;
        int[] bestMove = new int[2];
        for (int i = 0; i < TicTacToe.boardSize; i++) {
            for (int j = 0; j < TicTacToe.boardSize; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                    int tempScore = Minimax.minimax(false, board);
                    board[i][j] = '-';
                    if (tempScore > bestScore) {
                        bestScore = tempScore;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }
        return bestMove;
    }
}