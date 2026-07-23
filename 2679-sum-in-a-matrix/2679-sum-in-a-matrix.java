class Solution {
    public int matrixSum(int[][] nums) {
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        for (int[] row : nums) {
            Arrays.sort(row);
        }
        while (i < nums[0].length) {
            while (j < nums.length) {
                sum = Math.max(sum, nums[j][i]);
                j++;
            }
            i++;
            max += sum;
            sum = 0;
            j = 0;
        }
        return max;
    }
}