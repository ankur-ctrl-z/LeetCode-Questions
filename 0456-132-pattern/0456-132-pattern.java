class Solution {
    public boolean find132pattern(int[] nums) {
        int num_i = nums[0];
        for(int j = 1; j < nums.length-1; j++) {
            num_i = Math.min(num_i, nums[j]);
            for(int k = j + 1; k < nums.length; k++) {
                if(num_i < nums[k] && nums[k] < nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}