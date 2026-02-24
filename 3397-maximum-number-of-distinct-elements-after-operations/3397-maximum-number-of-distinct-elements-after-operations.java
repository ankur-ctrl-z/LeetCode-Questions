class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums); 
        
        HashSet<Integer> set = new HashSet<>();
        int lastPlaced = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int candidate = Math.max(nums[i] - k, lastPlaced + 1);
            
            if (candidate <= nums[i] + k) {
                set.add(candidate);
                lastPlaced = candidate;
            }
        }
        
        return set.size();
    }
}