public class N-Queen {
    import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n]; 
        List<List<String>> ans = new ArrayList<>();
        solve(board, 0, ans);
        return ans;
    }

    public void solve(boolean[][] board, int row, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(construct(board));
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                solve(board, row + 1, ans);
                board[row][col] = false;
            }
        }
    }

    public boolean isSafe(boolean[][] board, int row, int col) {
        // vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // top-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

        // top-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }

    public List<String> construct(boolean[][] board) {
        List<String> result = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }
            result.add(sb.toString());
        }
        return result;
    }
}
}
