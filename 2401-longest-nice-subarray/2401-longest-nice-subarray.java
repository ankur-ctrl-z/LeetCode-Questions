class Solution {     
    public int longestNiceSubarray(int[] nums) {         
        int i = 0;         
        int j = 1;         
        int max = 1;         
        
        while(j < nums.length){             
            boolean hasConflict = false;
            
            // Check nums[j] against every element currently in your window
            for (int k = i; k < j; k++) {
                if ((nums[k] & nums[j]) != 0) {
                    hasConflict = true;
                    break; // Found a conflict!
                }
            }
            
            if (hasConflict) {                 
                // If there's a conflict, shrink the window from the left by 1
                i++; 
                // DO NOT increment j here. Loop will run again and re-check 
                // this same nums[j] against the newly shrunk window.
            } else {
                // If it passes all elements, update max and move to the next number
                max = Math.max(max, j - i + 1);             
                j++;         
            }
        }         
        return max;     
    } 
}