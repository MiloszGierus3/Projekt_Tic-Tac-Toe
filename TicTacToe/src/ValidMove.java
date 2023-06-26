class ValidMove {
    public static boolean validMove(int row, int col, char[][] board) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Błędny wiersz lub kolumna. Spróbuj ponownie.");
            return false;
        } else if (board[row][col] != '-') {
            System.out.println("To miejsce jest już zajęte. Spróbuj ponownie.");
            return false;
        } else {
            return true;
        }
    }
}