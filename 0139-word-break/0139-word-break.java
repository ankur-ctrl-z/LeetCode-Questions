class Solution {
    public boolean wordBreak(String target, List<String> arr) {
        Boolean[] dp = new Boolean[target.length()];
        return dfs(arr, target, 0, dp);
    }

    private boolean dfs(List<String> arr, String target, int idx, Boolean[] dp) {
        if (idx == target.length()) return true;
        if (dp[idx] != null) return dp[idx];

        for (String word : arr) {
            int len = word.length();
            if (idx + len <= target.length() &&
                target.startsWith(word, idx)) {

                if (dfs(arr, target, idx + len, dp)) {
                    return dp[idx] = true;
                }
            }
        }
        return dp[idx] = false;
    }
}

