import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0; // Left pointer
        int j = 0; // Right pointer
        int currentSum = 0;
        int maxSum = 0;

        while (j < nums.length) {
            // If duplicate exists, remove nums[i], subtract from sum, and increment i
            if (set.contains(nums[j])) {
                currentSum -= nums[i];
                set.remove(nums[i]);
                i++;
            } else {
                // Otherwise add nums[j], add to sum, update max, and increment j
                set.add(nums[j]);
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
                j++;
            }
        }

        return maxSum;
    }
}