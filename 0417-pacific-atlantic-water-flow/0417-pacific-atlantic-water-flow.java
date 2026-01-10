class Solution {
    int m, n;
    int[][] heights;
    boolean pacific, atlantic;
    boolean[][] visited;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        m = heights.length;
        n = heights[0].length;

        List<List<Integer>> result = new ArrayList<>();

        // Try DFS from every cell
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                visited = new boolean[m][n];
                pacific = false;
                atlantic = false;

                dfs(r, c);

                if (pacific && atlantic) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }
        return result;
    }

    private void dfs(int r, int c) {
        // boundary or visited check
        if (r < 0 || c < 0 || r >= m || c >= n || visited[r][c]) {
            return;
        }

        visited[r][c] = true;

        // Check ocean reach
        if (r == 0 || c == 0) pacific = true;
        if (r == m - 1 || c == n - 1) atlantic = true;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr >= 0 && nc >= 0 && nr < m && nc < n &&
                heights[nr][nc] <= heights[r][c]) {
                dfs(nr, nc);
            }
        }
    }
}
