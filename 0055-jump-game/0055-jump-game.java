class Solution {
    Boolean[] dp;
    public boolean canJump(int[] nums) {
        dp = new Boolean[nums.length];
        return jumpgame(nums,0,dp);
    }
    public static boolean jumpgame(int arr[], int idx, Boolean dp[]){
        if(dp[idx] != null){
            return dp[idx];
        }
        if (idx >= arr.length-1){
            return true;
        }
        if (arr[idx] == 0){
            dp[idx] = false;
            return false;
        }
        for(int i = 1; i <= arr[idx]; i++){
            if(jumpgame(arr, idx + i,dp)) {
                dp[idx] = true;
                return true;
            }
        }

        dp[idx] = false;
        return false;
    }
}