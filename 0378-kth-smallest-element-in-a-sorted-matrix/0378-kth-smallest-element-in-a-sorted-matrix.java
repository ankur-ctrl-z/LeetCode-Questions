class Solution {
    public int kthSmallest(int[][] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                pq.add(arr[i][j]);
            }
        }
        
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        
        return pq.poll();
    }
}
