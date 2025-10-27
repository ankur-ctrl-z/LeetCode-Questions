class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
         int sum =0;
      int arr[] = new int[nums.length];
      if(nums[0] == 0){
        arr[0] = -1;
      } else {
        arr[0] = 1;
      }
      for(int i = 1; i < nums.length; i++){
        if(nums[i] == 0){
            arr[i] = -1;
        } else {
            arr[i] = 1;
        }
      }


   for (int i = 0; i<arr.length; i++){
       sum+=arr[i];
       if (sum==0){
           maxi= i+1;

       }
       else {
           if (map.containsKey(sum)){
               maxi= Math.max(maxi, i- map.get(sum));

           }
           else {
               map.put(sum,i);
           }
       }

   }
      return maxi;
    }
}