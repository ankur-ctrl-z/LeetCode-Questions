class Solution {
    ArrayList<Integer>[] adj;
    int len;
    int cnt;
    public int[] gardenNoAdj(int n, int[][] paths) {
        len = n;
        adj = new ArrayList[n+1];
        for(int i = 0;i <= n;i++) adj[i] = new ArrayList<>();

        for(int[] path : paths) {
            adj[path[0]].add(path[1]);
            adj[path[1]].add(path[0]);
        }

        boolean[] visit = new boolean[n+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1;i <= n;i++){
            if(!visit[i]){
                cnt = 0;
                dfs(i, visit);
                map.put(i,cnt);
            }
        }

        int[] res = new int[len];
        visit = new boolean[n+1];
        for(int i = 1;i <= n;i++){
            if(!visit[i]){
                cnt = map.get(i);
                dfsPoss(i, visit, res);
            }
        }

        return res;
    }


    public void dfs(int node, boolean[] visit){
        cnt++;
        visit[node] = true;
        for(int next : adj[node]){
            if(!visit[next]){
                dfs(next, visit);
            }
        }
    }

    public boolean dfsPoss(int node, boolean[] visit, int[] type){
        visit[node] = true;
        cnt--;
        boolean res = false;
        for(int i = 1;i <= 4;i++){
            type[node-1] = i;
            boolean flg = true;
            for(int nxt: adj[node]){
                if(nxt != node && visit[nxt] && type[nxt-1] == type[node-1]){
                    flg = false;
                    break;
                }
            }
            if(flg){
                for(int nxt: adj[node]){
                    if(cnt == 0) return true;
                    if(!visit[nxt]){
                        res = dfsPoss(nxt, visit, type);
                    }
                    if(res) return true;
                }
                return res;
            }
        }

        return res;
    }
}