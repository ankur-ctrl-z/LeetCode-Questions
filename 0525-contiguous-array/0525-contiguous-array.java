class Solution {
    public int findMaxLength(int[] nums) {
      int arr[] = new int[nums.length];
      if(nums[0] == 0){
        arr[0] = -1;
      } else {
        arr[0] = 1;
      }
      for(int i = 1; i < nums.length; i++){
        if(nums[i] == 0){
            arr[i] = -1;
        } else {
            arr[i] = 1;
        }
      }
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                maxLen = i + 1;
            } else if (map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}