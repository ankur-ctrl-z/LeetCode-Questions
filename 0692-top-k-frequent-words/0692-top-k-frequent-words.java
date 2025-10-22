class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        LinkedList<String> ll = new LinkedList<>();
       HashMap<String, Integer> map = new HashMap<>();
       for(String num : words){
        map.put(num,map.getOrDefault(num,0)+1);
       } 
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!Objects.equals(a.getValue(), b.getValue())) {
                    return b.getValue() - a.getValue(); 
                }
                return a.getKey().compareTo(b.getKey());
            }
        );

        pq.addAll(map.entrySet());
        while(!pq.isEmpty() && k > 0){
            ll.add(pq.poll().getKey());
            k--;
        }
        return ll;
    }
}