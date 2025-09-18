class Solution {
    public int equalPairs(int[][] arr) {
        int count = 0;
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++){
            int row[] = arr[i];
            for(int j = 0; j < m; j++){
                int col[] = new int[m];
                for(int k = 0; k < n; k++){
                   col[k] = arr[k][j];
                }
                if(Safe(row,col)) count++;
            }
        }
        return count;
    }
    public static boolean Safe(int arr[], int arr2[]){
        if(arr.length != arr2.length) return false;
        for(int i = 0; i < arr.length; i++){
          if(arr[i] != arr2[i]){
            return false;
          }
        }
        return true;
    }
}