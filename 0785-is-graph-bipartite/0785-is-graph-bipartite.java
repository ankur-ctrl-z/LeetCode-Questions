class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i = 0; i < graph.length; i++){
            if(visited.containsKey(i)){
                continue;
            }
            q.add(new BipartitePair(i,0));
            while(!q.isEmpty()){
             BipartitePair rp = q.poll();
             if(visited.containsKey(rp.vtrx)){
                if(visited.get(rp.vtrx) != rp.dist){
                    return false;
                }
                continue;
             }
             visited.put(rp.vtrx,rp.dist);
             for(int nbrs: graph[rp.vtrx]){
                if(!visited.containsKey(nbrs)){
                    q.add(new BipartitePair(nbrs, rp.dist+1));
                }
              }
            }
        }
        return true;
    }
}
class BipartitePair{
    int vtrx;
    int dist;

    public BipartitePair(int vtrx, int dist){
        this.vtrx = vtrx;
        this.dist = dist;
    }
}