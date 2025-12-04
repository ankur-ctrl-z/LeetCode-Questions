class Solution {
    public int coinChange(int[] arr, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        
        int ans = mincoin(arr, amount, dp);
        return ans >= 1000000000 ? -1 : ans;
    }

    public static int mincoin(int[] arr, int amount, int[] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return 1000000000;

        if (dp[amount] != -1) return dp[amount];

        int ans = 1000000000;

        for (int coin : arr) {
            int sub = mincoin(arr, amount - coin, dp);
            ans = Math.min(ans, sub + 1);
        }

        return dp[amount] = ans;
    }
}