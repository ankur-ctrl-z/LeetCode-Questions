class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int countOfOnes = 0;
        for (int num : nums) {
            if (num == 1) countOfOnes++;
        }
        if (countOfOnes > 0) return n - countOfOnes;

        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentGcd = nums[i];
            for (int j = i; j < n; j++) {
                currentGcd = gcd(currentGcd, nums[j]);
                if (currentGcd == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) return -1;

        return (minLen - 1) + (n - 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
