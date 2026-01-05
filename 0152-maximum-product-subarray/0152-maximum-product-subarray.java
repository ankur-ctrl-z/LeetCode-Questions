class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] dpMax = new int[n];
        int[] dpMin = new int[n];

        dpMax[0] = nums[0];
        dpMin[0] = nums[0];

        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            dpMax[i] = Math.max(nums[i],
                         Math.max(dpMax[i - 1] * nums[i],
                                  dpMin[i - 1] * nums[i]));

            dpMin[i] = Math.min(nums[i],
                         Math.min(dpMax[i - 1] * nums[i],
                                  dpMin[i - 1] * nums[i]));

            ans = Math.max(ans, dpMax[i]);
        }
        return ans;
    }
}
