class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int zero = 0;
        boolean gotOne = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && gotOne == false){
                continue;
            } 
            else{
                gotOne = true;
                if(nums[i] == 1){
                    if(zero < k && i != 0 && i != 1){
                    return false;
                    }
                    zero = 0;
                }else {
                    zero++;
                }     
            }
        }
        return true;
    }
}