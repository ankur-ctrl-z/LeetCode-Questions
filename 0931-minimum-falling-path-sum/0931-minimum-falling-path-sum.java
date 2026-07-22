class Solution {
    public int minFallingPathSum(int[][] arr) {
        Integer dp[][] = new Integer[arr.length][arr[0].length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min,minimumpath(arr,0,i,dp));
        }
        return min;
    }
    public static int minimumpath(int arr[][],int row, int col, Integer[][] dp){
        if(col >= arr.length || col < 0){
            return Integer.MAX_VALUE;
        }
        
        if(row == arr.length-1){
            return arr[row][col];
        }
        if(dp[row][col] != null) return dp[row][col];
        int a = minimumpath(arr,row+1,col,dp);
        int b = minimumpath(arr,row+1,col-1,dp);
        int c = minimumpath(arr,row+1, col+1,dp);
        
        return dp[row][col] = arr[row][col] + Math.min(a,Math.min(b,c));

    }
}


