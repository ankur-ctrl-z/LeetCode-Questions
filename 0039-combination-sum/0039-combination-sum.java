class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int amount) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        combination(coin, amount, ll, 0, ans);
        return ans;
    }

    public void combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
        if (amount == 0) {
            ans.add(new ArrayList<>(ll)); 
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                combination(coin, amount - coin[i], ll, i, ans); 
                ll.remove(ll.size()-1); 
            }
        }
    }
}