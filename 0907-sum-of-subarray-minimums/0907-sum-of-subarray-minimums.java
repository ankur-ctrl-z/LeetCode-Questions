class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long result = 0;
        int mod = 1_000_000_007;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // Find minimum in subarray arr[i..j]
                int mini = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    mini = Math.min(mini, arr[k]);
                }

                // Add to result
                result = (result + mini) % mod;
            }
        }

        return (int) result;
    }
}
