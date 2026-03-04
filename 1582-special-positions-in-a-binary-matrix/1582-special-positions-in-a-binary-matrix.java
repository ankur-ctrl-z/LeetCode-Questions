class Solution {
    public int numSpecial(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        
        int[] row = new int[n];
        int[] col = new int[m];
        
        // Count ones in each row
        for (int i = 0; i < n; i++) {
            int one = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    one++;
                }
            }
            row[i] = one;
        }
        
        // Count ones in each column
        for (int j = 0; j < m; j++) {
            int one = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 1) {
                    one++;
                }
            }
            col[j] = one;
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
