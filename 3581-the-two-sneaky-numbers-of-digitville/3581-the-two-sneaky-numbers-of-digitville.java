class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       ArrayList<Integer>ll = new ArrayList<>();
       Arrays.sort(nums);
       int i = 0;
       int j = 1;
       while(j < nums.length){
        if(nums[i] == nums[j]){
            ll.add(nums[i]);
        }
        i++;
        j++;
       } 
       int result[] = new int[ll.size()];
       for(int k = 0; k < ll.size(); k++){
        result[k] = ll.get(k);
       }
       return result;
    }
}