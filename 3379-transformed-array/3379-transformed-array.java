class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = nums[i];
            } else {
                int newPos = (i + nums[i]) % n;
                if (newPos < 0) {
                    newPos += n; 
                }
                result[i] = nums[newPos];
            }
        }
        return result;
    }
}
