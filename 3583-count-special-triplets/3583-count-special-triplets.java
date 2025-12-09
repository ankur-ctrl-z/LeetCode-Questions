import java.util.HashMap;

class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int n = nums.length;
        long count = 0;

        // Frequency map for elements after current j
        HashMap<Integer, Integer> rightFreq = new HashMap<>();
        for (int k = 1; k < n; k++) {
            rightFreq.put(nums[k], rightFreq.getOrDefault(nums[k], 0) + 1);
        }

        // Frequency map for elements before current j
        HashMap<Integer, Integer> leftFreq = new HashMap<>();
        leftFreq.put(nums[0], 1);
        rightFreq.put(nums[1], rightFreq.get(nums[1]) - 1);
        if (rightFreq.get(nums[1]) == 0) rightFreq.remove(nums[1]);

        for (int j = 1; j < n - 1; j++) {
            int target = nums[j] * 2;

            int leftCount = leftFreq.getOrDefault(target, 0);
            int rightCount = rightFreq.getOrDefault(target, 0);

            count = (count + (long) leftCount * rightCount) % MOD;

            // Move nums[j] from rightFreq to leftFreq
            leftFreq.put(nums[j], leftFreq.getOrDefault(nums[j], 0) + 1);
            if (j + 1 < n) {
                rightFreq.put(nums[j + 1], rightFreq.get(nums[j + 1]) - 1);
                if (rightFreq.get(nums[j + 1]) == 0) {
                    rightFreq.remove(nums[j + 1]);
                }
            }
        }

        return (int) count;
    }
}
