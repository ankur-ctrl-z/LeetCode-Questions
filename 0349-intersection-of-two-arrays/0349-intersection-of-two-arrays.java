class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<>();
       HashSet<Integer> result  = new HashSet<>();
       for(int x : nums1){
        set.add(x);
       } 
       for(int i = 0; i < nums2.length; i++){
        if(set.contains(nums2[i])){
            result.add(nums2[i]);
        }
       }
       int resultArr[] = new int [result.size()];
       int index = 0;
       for(int value: result){
        if(set.size() > 1){
        resultArr[index] = value;
        index++;
       }else{
        resultArr[index] = value;
       }
       }
       return resultArr;
    }
}