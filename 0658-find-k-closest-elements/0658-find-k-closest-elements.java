class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int diffA = Math.abs(a - x);
                int diffB = Math.abs(b - x);
                if (diffA == diffB) return a - b; 
                return diffA - diffB; 
            }
        );

        for (int num : arr) pq.offer(num);

        List<Integer> result = new ArrayList<>();
        while (k > 0 && !pq.isEmpty()) {
            result.add(pq.poll());
            k--;
        }

        Collections.sort(result);
        return result;
    }
}

