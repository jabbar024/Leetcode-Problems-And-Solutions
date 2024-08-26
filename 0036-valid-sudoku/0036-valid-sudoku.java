class Solution {

    public static boolean isValidSubSudoku(char board[][], int row, int col) {
        boolean[] seen = new boolean[9];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[row + i][col + j] != '.') {
                    int num = board[row + i][col + j] - '1';
                    if (seen[num]) {
                        return false;
                    }
                    seen[num] = true;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        // Check every row
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length - 1; j++) {
                for (int k = j + 1; k < board[0].length; k++) {
                    if (board[i][j] != '.' && board[i][j] == board[i][k]) {
                        return false;
                    }
                }
            }
        }

        // Check every column
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length - 1; j++) {
                for (int k = j + 1; k < board.length; k++) {
                    if (board[j][i] != '.' && board[j][i] == board[k][i]) {
                        return false;
                    }
                }
            }
        }

        // For checking 3x3 grid
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[0].length; j += 3) {
                if (!isValidSubSudoku(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
