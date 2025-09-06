class Solution {
    public long minOperations(int[][] queries) {
        long total = 0;
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            total += (getOperations(r) - getOperations(l - 1) + 1) / 2;
        }
        return total;
    }

    private long getOperations(int n) {
        long result = 0;
        int ops = 0;
        for (long powerOfFour = 1; powerOfFour <= n; powerOfFour *= 4) {
            ops++;
            long start = powerOfFour;
            long end = Math.min(n, powerOfFour * 4 - 1);
            result += (end - start + 1) * ops;
        }
        return result;
    }
}
