class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return solve(n, 0, dp);
    }

    public static int solve(int n, int idx, int[] dp) {
        if (idx == n) return 1;
        if (idx > n) return 0;

        if (dp[idx] != 0) return dp[idx];

        int i = solve(n, idx + 1, dp);
        int j = solve(n, idx + 2, dp);

        return dp[idx] = i + j;
    }
}
