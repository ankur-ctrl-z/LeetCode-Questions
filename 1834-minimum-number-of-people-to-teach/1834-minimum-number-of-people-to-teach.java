class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer>[] userLangs = new Set[languages.length + 1];
        for (int i = 0; i < languages.length; i++) {
            userLangs[i + 1] = new HashSet<>();
            for (int lang : languages[i]) {
                userLangs[i + 1].add(lang);
            }
        }
        
        Set<Integer> problemUsers = new HashSet<>();
        for (int[] friendship : friendships) {
            int u = friendship[0], v = friendship[1];
            boolean canCommunicate = false;
            for (int lang : userLangs[u]) {
                if (userLangs[v].contains(lang)) {
                    canCommunicate = true;
                    break;
                }
            }
            if (!canCommunicate) {
                problemUsers.add(u);
                problemUsers.add(v);
            }
        }
        
        if (problemUsers.isEmpty()) return 0;
        
        int minTeachings = problemUsers.size();
        for (int lang = 1; lang <= n; lang++) {
            int teachings = 0;
            for (int user : problemUsers) {
                if (!userLangs[user].contains(lang)) {
                    teachings++;
                }
            }
            minTeachings = Math.min(minTeachings, teachings);
        }
        
        return minTeachings;
    }
}


