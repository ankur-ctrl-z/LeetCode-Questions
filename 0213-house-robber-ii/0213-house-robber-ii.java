class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int dp[] = new int[nums.length];
        int dp2[] = new int[nums.length];

        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);

        int result = Math.max(solvehouseRobber(nums,0,nums.length-1,dp), solvehouseRobber(nums,1,nums.length,dp2));
        return result;
    }
    public static int solvehouseRobber(int arr[], int idx,int end, int dp[]) {
        if(idx >= end){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int a = arr[idx] + solvehouseRobber(arr,idx+2,end,dp);
        int b = solvehouseRobber(arr,idx+1,end,dp);

        return dp[idx] = Math.max(a,b);
    }
}