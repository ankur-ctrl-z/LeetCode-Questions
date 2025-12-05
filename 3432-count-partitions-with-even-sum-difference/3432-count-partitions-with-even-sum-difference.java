class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];;
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
            int sum = 0;
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j];
            }
            if((prefix[i] - sum) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}