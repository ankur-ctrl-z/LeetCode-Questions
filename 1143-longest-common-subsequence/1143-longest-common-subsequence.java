class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length(); 
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return LCS(s1,s2,m,n,dp);
    }
    public static int LCS(String s1, String s2, int m, int n,int dp[][]){
        if(dp[m][n] != -1) return dp[m][n];
        if(m == 0 || n == 0) return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + LCS(s1,s2,m-1,n-1,dp);
        }
        int a = LCS(s1,s2,m-1,n,dp);
        int b = LCS(s1,s2,m,n-1,dp);
        return dp[m][n] = Math.max(a,b);
    }
}