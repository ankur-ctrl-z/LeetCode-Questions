class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (n < 2 * k) return false;

        for (int i = 0; i <= n - 2 * k; i++) {
            if (isIncreasing(nums, i, k) && isIncreasing(nums, i + k, k)) {
                return true;
            }
        }
        return false;
    }
    private boolean isIncreasing(List<Integer> nums, int start, int len) {
        for (int j = start; j < start + len - 1; j++) {
            if (nums.get(j) >= nums.get(j + 1)) {
                return false;
            }
        }
        return true;
    }
}