class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');

        countSolutions(board, 0);
        return count;
    }

    
    public void countSolutions(char[][] board, int row) {
        int n = board.length;

        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; 
                countSolutions(board, row + 1); 
                board[row][col] = '.'; 
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }
}