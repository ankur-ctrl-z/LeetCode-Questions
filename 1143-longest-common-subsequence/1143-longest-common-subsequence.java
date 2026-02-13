class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        for (int i = 0; i <= text1.length(); i++) {
         for(int j = 0; j <= text2.length(); j++){
            dp[i][j] = -1;
         }
        }
        return longest(text1.length(),text2.length(),text1,text2,dp);
    }
    public static int longest(int n, int m,String s1, String s2,int dp[][]){
        if(m == 0 || n == 0) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return dp[n][m] = 1 + longest(n-1,m-1,s1,s2,dp);
        } else {
            int a = longest(n-1,m,s1,s2,dp);
            int b = longest(n,m-1,s1,s2,dp);

            return dp[n][m] = Math.max(a,b);
        }
    }
}