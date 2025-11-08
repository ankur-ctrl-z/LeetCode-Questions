class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);
        }
        while(!pq.isEmpty() && k != 0){
            int x = pq.poll();
            x++;
            pq.offer(x);
            k--;
        }
        long sum = 1;
        long mod = 1_000_000_007;
        while(!pq.isEmpty()){
            sum = (sum * pq.poll()) % mod;
        }
        return (int)sum;
    }
}