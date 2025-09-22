class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num : nums){
        map.put(num, map.getOrDefault(num,0) + 1);
       } 
       int max = 0;
       int count = 0;
       for(int x : map.values()){
        if(x > count){
            count = x;
            max = x;
        } else if(x == count){
            max += x;
        }
       }
       return max;
    }
}