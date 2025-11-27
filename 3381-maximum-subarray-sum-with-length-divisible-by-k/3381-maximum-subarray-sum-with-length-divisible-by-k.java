class Solution {
    public long maxSubarraySum(int[] nums, int k) {

        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long[] minPrefix = new long[k];
        for (int i = 0; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE;
        }

        long ans = Long.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            int rem = i % k;

            if (minPrefix[rem] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix[i] - minPrefix[rem]);
            }

            minPrefix[rem] = Math.min(minPrefix[rem], prefix[i]);
        }

        return ans;
    }
}

