class Solution {
    public int[] twoSum(int[] nums, int target) {
    ArrayList<Integer> list = new ArrayList<>();
     for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length; j++){
            if(i != j && nums[i] + nums[j] == target) {
               list.add(i); 
               list.add(j);

               int result[] = new int[list.size()];
               for(int k = 0; k < list.size(); k++){
                 result[k] = list.get(k);
               }
               return result;
            }
        }
     }
     return new int[0];
    }
}
