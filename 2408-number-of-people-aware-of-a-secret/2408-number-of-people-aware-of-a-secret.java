class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        dp[1] = 1;  
        
        long shareSum = 0;  

        for (int day = 2; day <= n; day++) {
            int start = day - forget;
            if (start >= 1) {
                shareSum = (shareSum - dp[start] + MOD) % MOD; 
            }
            
            int begin = day - delay;
            if (begin >= 1) {
                shareSum = (shareSum + dp[begin]) % MOD;
            }

            dp[day] = shareSum;
        }

        long result = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) {
                result = (result + dp[i]) % MOD;
            }
        }
        return (int) result;
    }
}
