class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, l = 0, sum = 0, res = Integer.MAX_VALUE;
        for (int r = 0; r < n; r++) {
            sum += nums[r];
            while (sum >= target) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
