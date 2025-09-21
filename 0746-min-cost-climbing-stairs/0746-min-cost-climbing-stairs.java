class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int dp[] =  new int [arr.length];
        Arrays.fill(dp, -1);
        return Math.min(min_cost(arr, 0, dp), min_cost(arr, 1, dp));
     
    }
    public static int min_cost(int arr[], int i, int dp[]){
        if( i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int f = min_cost(arr, i + 1,dp);
        int s = min_cost(arr, i + 2, dp);

        return dp[i] = Math.min(f,s) + arr[i];
    }
}