class Solution {
    public boolean canPartition(int[] nums) {
        if (nums.length < 2) return false;

        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % 2 != 0) return false;

        int target = sum / 2;

        // dp[idx][currSum] → null = not computed
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return partitionCheck(nums, 0, 0, target, dp);
    }

    public boolean partitionCheck(int[] nums, int idx, int currSum, int target, Boolean[][] dp) {
        if (currSum == target) return true;
        if (idx >= nums.length || currSum > target) return false;

        if (dp[idx][currSum] != null) return dp[idx][currSum];

        boolean take = partitionCheck(nums, idx + 1, currSum + nums[idx], target, dp);

        boolean notTake = partitionCheck(nums, idx + 1, currSum, target, dp);

        return dp[idx][currSum] = take || notTake;
    }
}