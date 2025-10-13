class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length == 1 || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int diff = 0;
        int a = 0;
        int b = 1;
        while(b < nums.length){
            if(nums[b] - nums[a] > diff){
                diff = nums[b] - nums[a];
            }
            a++;
            b++;
        }
        return diff;
    }
}