class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;

        // Build heights in-place
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            Integer[] row = new Integer[n];
            for (int j = 0; j < n; j++) {
                row[j] = matrix[i][j];
            }

            Arrays.sort(row, Collections.reverseOrder());

            for (int width = 1; width <= n; width++) {
                int h = row[width - 1];
                ans = Math.max(ans, h * width);
            }
        }

        return ans;
    }
}