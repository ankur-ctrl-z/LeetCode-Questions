class Solution {
    public int minimumDistance(int[] nums) {
        int i = 0;
        int j = 1;
        int k = 2;

        int result = Integer.MAX_VALUE;

        while (i < nums.length) {
            while (j < nums.length) {
                while (k < nums.length) {
                   if(nums[i] == nums[j] && nums[j] == nums[k] && nums[i] == nums[k]){
                     int temp = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                     result = Math.min(result,temp);
                   }
                   k++;
                }
                j++;
                k = j+1;
            }
            i++;
            j = i+1;
            k = i+2;
        }
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
}