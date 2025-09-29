class Solution {
    int[][] t;
    int n;

    private int solve(List<List<Integer>> triangle, int row, int col) {
        if (row == n - 1) {
            return triangle.get(row).get(col);
        }

        if (t[row][col] != Integer.MAX_VALUE) {
            return t[row][col];
        }

        int minPath = triangle.get(row).get(col) +
                      Math.min(solve(triangle, row + 1, col),
                               solve(triangle, row + 1, col + 1));

        return t[row][col] = minPath;
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        n = triangle.size();
        t = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(t[i], Integer.MAX_VALUE);
        }

        return solve(triangle, 0, 0);
    }
}
