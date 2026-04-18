class Solution {
    public int mirrorDistance(int n) {
        String s = Integer.toString(n);
        String reversed = new StringBuilder(s).reverse().toString();
        return Math.abs(n - Integer.parseInt(reversed));
    }
}