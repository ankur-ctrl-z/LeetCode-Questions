class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int digitSum = convert(nums[i]); 
            min = Math.min(min, digitSum);
        }
        
        return min;
    }
    
    private int convert(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  
            num /= 10;       
        }
        return sum;
    }
}