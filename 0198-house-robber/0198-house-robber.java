class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    
    }
    public static int solve(int arr[], int i,int dp[]){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int a = arr[i] + solve(arr,i+2,dp);
        int b = solve(arr,i+1,dp);

        dp[i] = Math.max(a,b);
        return dp[i];
    }
}