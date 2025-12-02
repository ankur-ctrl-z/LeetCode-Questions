class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(
            solve(cost, 0,dp),
            solve(cost, 1,dp)
        );
    }

    private int solve(int[] cost, int idx, int dp[]) {
        if (idx >= cost.length) {
            return 0;
        }
        if(dp[idx] != -1) return dp[idx];
        int one = solve(cost, idx + 1, dp);
        int two = solve(cost, idx + 2, dp);

        dp[idx] =  cost[idx] + Math.min(one, two);
        return dp[idx];
    }
}



