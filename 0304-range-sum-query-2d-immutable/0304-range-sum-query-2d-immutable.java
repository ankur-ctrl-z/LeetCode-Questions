class NumMatrix {
    private int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        prefixSum = new int[m + 1][n + 1];  

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = matrix[i - 1][j - 1]
                                + prefixSum[i - 1][j]
                                + prefixSum[i][j - 1]
                                - prefixSum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int r1 = row1 + 1, c1 = col1 + 1, r2 = row2 + 1, c2 = col2 + 1;

        return prefixSum[r2][c2]
             - prefixSum[r1 - 1][c2]
             - prefixSum[r2][c1 - 1]
             + prefixSum[r1 - 1][c1 - 1];
    }
}


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */