class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0; 
        int j = 0; 
        int currentSum = 0;
        int maxSum = 0;

        while (j < nums.length) {
            if (set.contains(nums[j])) {
                currentSum -= nums[i];
                set.remove(nums[i]);
                i++;
            } else {
                set.add(nums[j]);
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
                j++;
            }
        }

        return maxSum;
    }
}