class Solution {     
    public int longestNiceSubarray(int[] nums) {         
        int i = 0;         
        int j = 1;         
        int max = 1;         
        
        while(j < nums.length){             
            boolean hasConflict = false;
            
            for (int k = i; k < j; k++) {
                if ((nums[k] & nums[j]) != 0) {
                    hasConflict = true;
                    break; 
                }
            }
            
            if (hasConflict) {                 
                i++; 
            } else {
                max = Math.max(max, j - i + 1);             
                j++;         
            }
        }         
        return max;     
    } 
}