class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        Arrays.sort(nums);

        for (int k = 1; k <= n / 2; k++) {
            if ((totalSum * k) % n == 0) {
                int target = (totalSum * k) / n;
                if (canFind(nums, 0, k, target, new HashMap<>())) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean canFind(int[] nums, int index, int k, int target, Map<String, Boolean> memo) {
        if (k == 0) return target == 0;
        if (index == nums.length) return false;

        String key = index + "," + k + "," + target;
        if (memo.containsKey(key)) return memo.get(key);

        if (nums[index] <= target) {
            if (canFind(nums, index + 1, k - 1, target - nums[index], memo)) {
                memo.put(key, true);
                return true;
            }
        }

        if (canFind(nums, index + 1, k, target, memo)) {
            memo.put(key, true);
            return true;
        }

        memo.put(key, false);
        return false;
    }
}
