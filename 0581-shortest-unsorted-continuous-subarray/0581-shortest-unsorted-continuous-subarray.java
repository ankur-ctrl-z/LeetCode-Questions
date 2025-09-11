class Solution {
    public int findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        int start = -1, end = -2; 
        int maxSoFar = arr[0], minSoFar = arr[n - 1];

        for (int i = 1; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if (arr[i] < maxSoFar) {
                end = i;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            minSoFar = Math.min(minSoFar, arr[i]);
            if (arr[i] > minSoFar) {
                start = i;
            }
        }

        return end - start + 1;
    }
}
