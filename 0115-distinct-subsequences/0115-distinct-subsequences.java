class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        Integer[][] dp = new Integer[n + 1][m + 1]; 
        return count(s, t, 0, 0, dp);
    }

    private int count(String s, String t, int i, int j, Integer[][] dp) {
        if (j == t.length()) return 1;

        if (i == s.length()) return 0;

        if (dp[i][j] != null) return dp[i][j];

        int ans = 0;

        if (s.charAt(i) == t.charAt(j)) {
            ans += count(s, t, i + 1, j + 1, dp); 
        }

        ans += count(s, t, i + 1, j, dp);

        dp[i][j] = ans;
        return ans;
    }
}

