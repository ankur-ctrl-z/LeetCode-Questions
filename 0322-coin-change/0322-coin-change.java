class Solution {
    public int coinChange(int[] arr, int amount) {
        int count = 0;
        if(amount == 0){
            return 0;
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){
            while(arr[i] <= amount && amount >= 0){
               amount -= arr[i];
               count++;
            }
        }
        if(amount != 0){
            return -1;
        }
        return count;
    }
}