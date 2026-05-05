class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return recursion(arr, 0, k, dp);
    }

    public int recursion(int[] arr, int i, int k, int[] dp){
        if(i == arr.length) return 0;

        if(dp[i] != -1) return dp[i];

        int result = 0;
        int curr_max = 0;

        for(int j = i; j < arr.length && j - i + 1 <= k; j++){
            curr_max = Math.max(curr_max, arr[j]);
            int sum = curr_max * (j - i + 1) + recursion(arr, j + 1, k, dp);
            result = Math.max(result, sum);
        }

        return dp[i] = result;
    }
}