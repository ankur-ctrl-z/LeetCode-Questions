class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return robFrom(0, nums, memo);
    }

    private int robFrom(int i, int[] nums, int[] memo) {
        if (i >= nums.length) return 0;

        if (memo[i] != -1) return memo[i];

        int rob = nums[i] + robFrom(i + 2, nums, memo);
        int skip = robFrom(i + 1, nums, memo);

        memo[i] = Math.max(rob, skip);
        return memo[i];
    }
}
