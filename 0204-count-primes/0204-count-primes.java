class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        int[] arr = new int[n]; 
        arr[0] = arr[1] = 1; 

        for (int i = 2; i * i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = 1; 
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        return count;
    }
}