class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        // Step 1: Add all 0s to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}}; // 4 directions

        // Step 2: BFS
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            for (int[] dir : dirs) {
                int newRow = cell[0] + dir[0];
                int newCol = cell[1] + dir[1];

                if (newRow >=0 && newRow < m && newCol >=0 && newCol < n && !visited[newRow][newCol]) {
                    mat[newRow][newCol] = mat[cell[0]][cell[1]] + 1;
                    visited[newRow][newCol] = true;
                    q.add(new int[]{newRow, newCol});
                }
            }
        }

        return mat;
    }
}
}