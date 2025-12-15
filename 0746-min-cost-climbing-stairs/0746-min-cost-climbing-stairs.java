class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp,-1);
       return Math.min(minimum(cost,0,dp),minimum(cost,1,dp)); 
    }
    public static int minimum(int arr[], int idx,int dp[]){
        if(idx >= arr.length) return 0 ;
        if(dp[idx] != -1) return dp[idx];
        int a = arr[idx] + minimum(arr,idx+2,dp);
        int b = arr[idx] + minimum(arr,idx+1,dp);

        return dp[idx] = Math.min(a,b);
    }
}