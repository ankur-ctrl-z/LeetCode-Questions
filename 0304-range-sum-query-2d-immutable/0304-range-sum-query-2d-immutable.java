class NumMatrix {
    private int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        prefixSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int top = (i > 0) ? prefixSum[i-1][j] : 0;
                int left = (j > 0) ? prefixSum[i][j-1] : 0;
                int overlap = (i > 0 && j > 0) ? prefixSum[i-1][j-1] : 0;

                prefixSum[i][j] = matrix[i][j] + top + left - overlap;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = prefixSum[row2][col2];
        int extraTop = (row1 > 0) ? prefixSum[row1 - 1][col2] : 0;
        int extraLeft = (col1 > 0) ? prefixSum[row2][col1 - 1] : 0;
        int extraOverlap = (row1 > 0 && col1 > 0) ? prefixSum[row1 - 1][col1 - 1] : 0;

        return total - extraTop - extraLeft + extraOverlap;
    }
}


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */