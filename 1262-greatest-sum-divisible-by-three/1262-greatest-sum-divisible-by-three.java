import java.util.Arrays;

class Solution {
    private static final int NEG = -1_000_000_000;

    public int maxSumDivThree(int[] nums) {
        int[][] dp = new int[nums.length][3];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return solve(nums, 0, 0, dp);
    }

    private int solve(int[] nums, int index, int remainder, int[][] dp) {
        if (index == nums.length) {
            return remainder == 0 ? 0 : NEG;
        }

        if (dp[index][remainder] != Integer.MIN_VALUE) {
            return dp[index][remainder];
        }

        int notTake = solve(nums, index + 1, remainder, dp);

        int next = solve(
            nums,
            index + 1,
            (remainder + nums[index]) % 3,
            dp
        );

        int take = next == NEG ? NEG : nums[index] + next;

        return dp[index][remainder] = Math.max(take, notTake);
    }
}