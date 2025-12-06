class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return perfectsqaure(n,dp);
    }
    public static int perfectsqaure(int n,int dp[]){
        int min = 1000000;
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        for(int i = 1; i <= Math.sqrt(n); i++){
          int sqaure = i*i;
          int a = 1 + perfectsqaure(n-sqaure,dp);
          min = Math.min(min,a);
        }
        return dp[n] = min;
    }
}