class Solution {
    public int[][] candyCrush(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean shouldContinue = false;

        // Step 1: Mark candies to be crushed horizontally
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 2; j++) {
                int val = Math.abs(board[i][j]);
                if (val > 0 && Math.abs(board[i][j + 1]) == val && Math.abs(board[i][j + 2]) == val) {
                    board[i][j] = -val;
                    board[i][j + 1] = -val;
                    board[i][j + 2] = -val;
                    shouldContinue = true;
                }
            }
        }

        // Step 2: Mark candies to be crushed vertically
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n; j++) {
                int val = Math.abs(board[i][j]);
                if (val > 0 && Math.abs(board[i + 1][j]) == val && Math.abs(board[i + 2][j]) == val) {
                    board[i][j] = -val;
                    board[i + 1][j] = -val;
                    board[i + 2][j] = -val;
                    shouldContinue = true;
                }
            }
        }

        // Step 3: Drop crushed candies (gravity)
        if (shouldContinue) {
            for (int j = 0; j < n; j++) {
                int writeRow = m - 1;
                for (int i = m - 1; i >= 0; i--) {
                    if (board[i][j] > 0) {
                        board[writeRow--][j] = board[i][j];
                    }
                }
                while (writeRow >= 0) {
                    board[writeRow--][j] = 0;
                }
            }
            return candyCrush(board);
        }

        return board;
    }
}