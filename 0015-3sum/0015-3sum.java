class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int N = nums.length;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < N - 2; i++) {
            if (nums[i] > 0) break;
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int m = i + 1;
            int n = N - 1;
            
            while (m < n) {
                int sum = nums[i] + nums[m] + nums[n];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[m], nums[n]));
                    
                    while (m < n && nums[m] == nums[m + 1]) m++;
                    while (m < n && nums[n] == nums[n - 1]) n--;
                    
                    m++;
                    n--;
                } else if (sum < 0) {
                    m++;
                } else {
                    n--;
                }
            }
        }
        return result;
    }
}
