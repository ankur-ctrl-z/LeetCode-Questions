class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        int n = sorted.size();
        if(n <= 2){
            return sorted.get(n-1);
        }else {
            return sorted.get(n-3);
        }
    }
}