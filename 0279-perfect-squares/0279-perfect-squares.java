class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return perfectsquare(n,dp);
    }
    public static int perfectsquare(int n,int dp[]){
        int min = 100000;
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        for(int i = 1; i <= Math.sqrt(n); i++){
            int square = i * i;
            int a = 1 + perfectsquare(n-square,dp);
            min = Math.min(a,min);
        }
        return dp[n] = min;
    }
}