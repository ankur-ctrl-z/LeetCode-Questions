class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
       ArrayList<Integer> ll = new ArrayList<>(); 
       HashMap<Integer,Integer> map = new HashMap<>();
       double required = Math.floor(n/3);

       for(int num: nums){
        map.put(num,map.getOrDefault(num, 0) + 1);
       }
       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getValue() > required){
            ll.add(entry.getKey());
        }
       }
       return ll;
    }
}