class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0) return 0;
        Arrays.sort(nums);
        int potential = 0;
        int i = 0;
        int j = 1;
        int count = 1;
        int max = 1;
        while(j < nums.length){
            if(nums[i]+1 == nums[j]){
                count++;
                max = Math.max(max,count);
            } else if(nums[i] == nums[j]){
                i++;
                j++;
                continue;
            }else {
                count = 1;
                potential = nums[j];
            }
            i++;
            j++;
        }
        return max;
    }
}