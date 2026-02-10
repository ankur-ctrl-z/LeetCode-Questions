class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;

        int i = 0;
        int j = 1;
        int k = 2;
        int count = 0;

        while (k < nums.length - count) {
            if (nums[i] == nums[j] && nums[j] == nums[k]) {

                for (int a = k; a < nums.length - 1; a++) {
                    nums[a] = nums[a + 1];
                }

                count++;

            } else {
                i++;
                j++;
                k++;
            }
        }
        return nums.length - count;
    }
}
