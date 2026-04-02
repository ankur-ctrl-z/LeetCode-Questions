class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        String s = "";
        long result = 0;
        while(i <= j){
            if(i == j){
                s += nums[i];
                result += Long.parseLong(s);
                return result;
            }
           s += nums[i];
           s += nums[j];

           result += Long.parseLong(s);
           s = "";

           i++;
           j--;
        }
        return result;
    }
}