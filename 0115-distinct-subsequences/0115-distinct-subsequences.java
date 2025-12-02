class Solution {
    long[][] dp;

    public int numDistinct(String s, String t) {
        dp = new long[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return (int) count(s, t, 0, 0);
    }

    private long count(String s, String t, int i, int j) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        long inc = 0, exc;

        if (s.charAt(i) == t.charAt(j)) {
            inc = count(s, t, i + 1, j + 1);
        }

        exc = count(s, t, i + 1, j);

        return dp[i][j] = inc + exc;
    }
}
