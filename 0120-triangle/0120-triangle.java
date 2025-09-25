class Solution {
    public int minimumTotal(List<List<Integer>> ll) {
        int n = ll.size();
        Integer[][] dp = new Integer[n][n];
        return solve(dp, ll, 0, 0);
    }

    public static int solve(Integer arr[][], List<List<Integer>> ll, int row, int col){
       int n = ll.size();

       if(row == n-1){
           return ll.get(row).get(col);
       }

       if(arr[row][col] != null){
           return arr[row][col];
       }

       int minsum = ll.get(row).get(col) + Math.min(solve(arr, ll, row+1, col), solve(arr, ll, row+1, col+1));

       arr[row][col] = minsum;   
       return arr[row][col];
    }
}
