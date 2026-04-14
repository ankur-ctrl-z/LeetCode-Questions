class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int smallest = nums[i];
            int replace = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < smallest) {
                    smallest = nums[j];
                    replace = j;
                }
            }
            if (replace != i) {
                int temp = nums[i];
                nums[i] = smallest;
                nums[replace] = temp;
            }
        }
    }
}