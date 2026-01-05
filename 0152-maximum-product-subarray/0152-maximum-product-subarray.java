class Solution {
        public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int currentProd = 1;

        for (int num : nums) {
            currentProd *= num;
            max = Math.max(currentProd, max);

            if (currentProd == 0) {
                currentProd = 1;
            }
        }

        currentProd = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            currentProd *= num;
            max = Math.max(currentProd, max);

            if (currentProd == 0) {
                currentProd = 1;
            }
        }

        return max;
    }
}
