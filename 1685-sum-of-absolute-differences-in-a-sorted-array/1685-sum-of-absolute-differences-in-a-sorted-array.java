class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        for (int j = 0; j < n; j++) {
            result[0] += nums[j] - nums[0];
        }

        for (int i = 1; i < n; i++) {

            int diff = nums[i] - nums[i - 1];

            result[i] = result[i - 1]
                       + diff * i
                       - diff * (n - i);
        }

        return result;
    }
}