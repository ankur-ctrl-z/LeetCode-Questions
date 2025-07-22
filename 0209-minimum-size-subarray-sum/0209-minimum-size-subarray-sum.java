class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int minLength =  Integer.MAX_VALUE, i =0 , sum = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];

            while(sum >= target){
                minLength = Math.min(minLength,j- i+1);
                sum = sum - arr[i];
                i++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}