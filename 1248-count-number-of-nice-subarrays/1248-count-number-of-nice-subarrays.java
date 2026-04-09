class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] countMap = new int[nums.length + 1];
        countMap[0] = 1;
        
        int oddCount = 0;
        int result = 0;
        
        for (int num : nums) {

            if (num % 2 != 0) {
                oddCount++;
            }

            if (oddCount >= k) {
                result += countMap[oddCount - k];
            }
            
            countMap[oddCount]++;
        }
        
        return result;
    }
}
