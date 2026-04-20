class Solution {
    public int maxDistance(int[] arr) {
        int i = 0;
        int j = 1;
        int max = 0, result = 0;
        while(i < arr.length-1) {
            while(j < arr.length) {
                if(arr[i] != arr[j]) {
                   max = Math.abs(i-j);
                   result = Math.max(result,max);
                }
                j++;
            }
            i++;
            j = i+1;
        }
        return result;
    }
}