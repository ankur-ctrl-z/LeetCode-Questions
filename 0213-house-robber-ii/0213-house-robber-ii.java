class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // Case 1: use houses 0 to n-2
        int case1 = robLinear(nums, 0, n - 2);

        // Case 2: use houses 1 to n-1
        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int robLinear(int[] arr, int start, int end) {
        int prev = 0;  
        int prev2 = 0; 

        for (int i = start; i <= end; i++) {
            int take = arr[i] + prev2;
            int notTake = prev;
            int curr = Math.max(take, notTake);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
