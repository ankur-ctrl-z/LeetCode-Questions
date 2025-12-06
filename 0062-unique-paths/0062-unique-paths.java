class Solution {
    public int uniquePaths(int m, int n) {
       int arr[][] = new int[m][n];
       int dp[][] = new int[m][n];
       return solve(arr,0,0,dp);
    }
    public static int solve(int arr[][],int row, int col,int dp[][]){
        if(row == arr.length-1 && col == arr[0].length-1){
            return 1;
        }
        if(row >= arr.length || col >= arr[0].length){
            return 0;
        }
        if(dp[row][col] != 0) return dp[row][col];

        int i = solve(arr,row+1,col,dp);
        int j = solve(arr,row,col+1,dp);

        return dp[row][col] = i+j;
    }
}