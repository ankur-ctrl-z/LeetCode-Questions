class Solution {

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];

        // initialize with -1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(word1, word2, n, m, dp);
    }

    private int solve(String s1, String s2, int i, int j, int[][] dp) {
        if (i == 0) return j;
        if (j == 0) return i;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j] = solve(s1, s2, i - 1, j - 1, dp);
        }

        int insert  = solve(s1, s2, i, j - 1, dp);
        int delete  = solve(s1, s2, i - 1, j, dp);
        int replace = solve(s1, s2, i - 1, j - 1, dp);

        return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
    }
}
