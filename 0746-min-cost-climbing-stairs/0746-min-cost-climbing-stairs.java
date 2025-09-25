class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int dp[] =  new int [arr.length];
        Arrays.fill(dp, -1);
        return Math.min(min_cost(dp,arr, 0), min_cost(dp,arr, 1));
     
    }
    public static int min_cost(int dp[], int arr[], int i){
        if( i >= arr.length){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int f = min_cost(dp,arr, i + 1);
        int s = min_cost(dp,arr, i + 2);

        dp[i] =  Math.min(f,s) + arr[i];
        return dp[i];
    }
}