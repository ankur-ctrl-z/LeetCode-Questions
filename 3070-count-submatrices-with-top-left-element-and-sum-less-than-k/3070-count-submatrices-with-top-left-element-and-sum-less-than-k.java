class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] pref = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pref[i][j] = grid[i][j];
                if (i > 0) pref[i][j] += pref[i - 1][j];
                if (j > 0) pref[i][j] += pref[i][j - 1];
                if (i > 0 && j > 0) pref[i][j] -= pref[i - 1][j - 1];
            }
        }
        
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pref[i][j] <= k) count++;
            }
        }
        
        return count;
    }
}