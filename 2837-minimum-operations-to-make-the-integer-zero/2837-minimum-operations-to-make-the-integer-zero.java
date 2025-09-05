class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long target = (long) num1 - (long) k * num2;
            if (target < k) break;
            if (Long.bitCount(target) <= k) return k;
        }
        return -1;
    }
}
