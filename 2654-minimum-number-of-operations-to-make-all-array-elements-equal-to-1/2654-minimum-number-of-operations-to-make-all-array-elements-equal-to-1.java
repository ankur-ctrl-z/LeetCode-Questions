class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        boolean odd = false;
        int isone = 0;
        boolean one = false;
        for(int num : nums){
            if(num % 2 != 0){
                odd = true;
            } else if(num == 1){
                one = true;
                isone++;
            }
        }
        if(odd){
            return nums.length;
        } else if(one) {
            return nums.length - isone;
        } else {
            return -1;
        }
    }
}