class Solution {
    public int integerReplacement(int n) {
        return solve(n);
    }

    public static int solve(long n) {
        if (n <= 1) return 0;

        if (n % 2 == 0) {
            return 1 + solve(n / 2);
        } else {
            return 1 + Math.min(solve(n - 1), solve(n + 1));
        }
    }
}
