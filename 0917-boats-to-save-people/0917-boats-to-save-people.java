class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        int total = 0;

        while (i <= j) {
            if (arr[i] + arr[j] <= limit) {
                i++; 
                j--;
                total++;
            } else {
                j--; 
                total++;    
            }
        }
        return total;
    }
}