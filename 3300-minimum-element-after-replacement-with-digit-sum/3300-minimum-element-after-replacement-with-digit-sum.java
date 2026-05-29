class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int tochange = nums[i];
            nums[i] = convert(tochange);
            min = Math.min(min, nums[i]);
        }
        return min;
    }
    public static int convert(int num){
        String s = Integer.toString(num);
        int result = 0;
        for(int i = 0; i < s.length(); i++){
           int add = s.charAt(i) - '0';
           result += add;
        }
        return result;
    }
}