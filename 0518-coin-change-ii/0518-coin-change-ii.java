class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        Integer[][] dp = new Integer[n][amount + 1];
        return solve(0, amount, coins, dp);
    }

    private int solve(int idx, int amount, int[] coins, Integer[][] dp) {
        if (amount == 0) return 1;
        if (idx == coins.length) return 0;

        if (dp[idx][amount] != null) return dp[idx][amount];

        int ways = 0;

        if (amount >= coins[idx]) {
            ways += solve(idx, amount - coins[idx], coins, dp);
        }

        ways += solve(idx + 1, amount, coins, dp);

        return dp[idx][amount] = ways;
    }
}

