class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        // 0 -> Not visited
        // 1 -> Currently visiting
        // 2 -> Safe
        // 3 -> Unsafe
        int[] state = new int[graph.length];

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            if (dfs(graph, state, i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    public boolean dfs(int[][] graph, int[] state, int idx) {

        // Already known to be safe
        if (state[idx] == 2) {
            return true;
        }

        // Already known to be unsafe
        if (state[idx] == 3) {
            return false;
        }

        // Currently visiting -> cycle detected
        if (state[idx] == 1) {
            return false;
        }

        // Mark as currently visiting
        state[idx] = 1;

        for (int neighbor : graph[idx]) {

            // If any neighbor is unsafe,
            // current node is also unsafe.
            if (!dfs(graph, state, neighbor)) {
                state[idx] = 3;
                return false;
            }
        }

        // All neighbors are safe
        state[idx] = 2;
        return true;
    }
}