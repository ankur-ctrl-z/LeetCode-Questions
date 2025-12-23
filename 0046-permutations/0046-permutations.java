class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, new boolean[nums.length], ll, result);
        return result;
    }

    public static void permutation(int[] nums, boolean[] used, List<Integer> ll, List<List<Integer>> result) {
        if (ll.size() == nums.length) {
            result.add(new ArrayList<>(ll)); 
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; 

            ll.add(nums[i]);       
            used[i] = true;
            permutation(nums, used, ll, result); 
            ll.remove(ll.size() - 1); 
            used[i] = false;
        }
    }
}