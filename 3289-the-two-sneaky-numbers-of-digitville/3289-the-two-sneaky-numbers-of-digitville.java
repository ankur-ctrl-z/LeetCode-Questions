class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int result[] = new int[2];
       Arrays.sort(nums);
       int i = 0;
       int j = 1;
       int k = 0;
       while(j < nums.length){
        if(nums[i] == nums[j]){
            result[k] = nums[i];
            k++;
        }
        i++;
        j++;
       } 
       return result;
    }
}