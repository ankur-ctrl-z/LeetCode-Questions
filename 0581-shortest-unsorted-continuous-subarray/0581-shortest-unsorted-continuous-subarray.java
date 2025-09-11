class Solution {
    public int findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        int x = -1, y = -2; 
        int max = arr[0], min = arr[n - 1];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            if (arr[i] < max) {
                y = i;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            if (arr[i] > min) {
                x = i;
            }
        }

        return y - x + 1;
    }
}
