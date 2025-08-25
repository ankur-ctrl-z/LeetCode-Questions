class Solution {
    public int coinChange(int[] arr, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); 
        dp[0] = 0; 

        for (int i = 1; i <= amount; i++) {
            for (int val : arr) {
                if (val <= i) {
                    dp[i] = Math.min(dp[i], dp[i - val] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
