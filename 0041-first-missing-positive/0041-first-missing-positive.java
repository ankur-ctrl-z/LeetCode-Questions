class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> ll = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            ll.add(num);
            max = Math.max(max, num);
        }
        boolean flag = false;
        for(int i = 1; i <= max; i++){
            if(!ll.contains(i)){
                return i;
            }
            flag = true;
        }
        if(flag == true){
            return max+1;
        }
        return 1;
    }
}