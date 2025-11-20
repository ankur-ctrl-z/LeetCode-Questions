class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] conver = new long[n];
        long[] result = new long[n];
        
        int maxSoFar = nums[0];
        conver[0] = nums[0] + maxSoFar;
        result[0] = conver[0];
        
        for (int i = 1; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);   
            conver[i] = nums[i] + maxSoFar;          
            result[i] = result[i-1] + conver[i];      
        }
        
        return result;
    }
}
