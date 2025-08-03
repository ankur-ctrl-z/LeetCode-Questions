class Solution {  
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        result.add(new ArrayList<>(tempList));  

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);            
            backtrack(i + 1, nums, tempList, result); 
            tempList.remove(tempList.size() - 1); 
        }
    }
}
