class Solution {
    public int minPathSum(int[][] arr) {
       int n = arr.length; 
       int m = arr[0].length;
       int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1; 
            }
        }
       return solve(arr,n,m,0,0,dp);
    }
    public static int solve(int arr[][],int n, int m,int row, int col,int dp[][]){
       if(row == n-1 && col == m-1) return arr[row][col];
       if(row >= n || col >= m) return (int)1e9;
       if(dp[row][col] !=  -1){
          return dp[row][col];
       }
       int i = solve(arr,n,m,row+1,col,dp);
       int j = solve(arr,n,m,row,col+1,dp);
       return dp[row][col] = Math.min(i,j)+arr[row][col];
    }
}