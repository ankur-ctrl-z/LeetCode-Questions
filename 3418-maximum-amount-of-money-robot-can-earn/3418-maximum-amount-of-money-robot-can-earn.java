class Solution {
    int m, n;
    Integer[][][] dp;

    public int maximumAmount(int[][] coins) {
        m = coins.length;
        n = coins[0].length;
        
        dp = new Integer[m][n][3];
        
        return solve(0, 0, 2, coins);
    }

    private int solve(int i, int j, int k, int[][] coins) {
        if (i >= m || j >= n) return Integer.MIN_VALUE;

        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && k > 0) return 0;
            return coins[i][j];
        }

        if (dp[i][j][k] != null) return dp[i][j][k];

        int val = coins[i][j];

        int right = solve(i, j + 1, k, coins);
        int down = solve(i + 1, j, k, coins);

        int best = Integer.MIN_VALUE;

        if (val >= 0) {
            best = val + Math.max(right, down);
        } else {
            int take = val + Math.max(right, down);

            int skip = Integer.MIN_VALUE;
            if (k > 0) {
                int rightSkip = solve(i, j + 1, k - 1, coins);
                int downSkip = solve(i + 1, j, k - 1, coins);
                skip = Math.max(rightSkip, downSkip); 
            }

            best = Math.max(take, skip);
        }

        return dp[i][j][k] = best;
    }
}