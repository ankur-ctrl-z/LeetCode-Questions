class Solution {
    public int equalPairs(int[][] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int[] row = arr[i];
            for(int j =  0; j < arr[0].length; j++){
                int[] col = new int[arr.length];
               for(int k = 0; k < arr.length; k++){
                 col[k] = arr[k][j];
               } 
               if(isSame(row,col)) count++;
            }
        }
        return count;
    }
    public static boolean isSame(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}