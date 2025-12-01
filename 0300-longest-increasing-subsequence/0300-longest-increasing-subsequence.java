class Solution {
    public int lengthOfLIS(int[] arr) {
        int ans[] = new int[arr.length];
        Arrays.fill(ans, 1);
        int count = 1;
        for(int i =1; i < arr.length; i++){
         for(int j = 0; j < i; j++){
            if(arr[j] < arr[i]){
               ans[i] = Math.max(ans[i], ans[j] + 1);
            }
         }
         count = Math.max(count, ans[i]);
        }
        return count;
    }
}