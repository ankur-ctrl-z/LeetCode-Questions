class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);
       int i = 0;
       while(i < nums.length-2){
        if(nums[i] != nums[i+1]){
          return nums[i];
        } else if(nums[i+1] != nums[i+2]) {
            return nums[i+2];
        }
        i =i+3;
       }
       return nums[nums.length-1];
    }
}