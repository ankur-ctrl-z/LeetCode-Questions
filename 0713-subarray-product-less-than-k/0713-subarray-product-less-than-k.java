

class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int count = 0;
        int product = 1;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
            while (product >= k && j<=i) {
               if(j <= i){
                product /= arr[j];
                j++;
               }
            }
            count += i - j + 1;
        }
        return count;
    }
    
}