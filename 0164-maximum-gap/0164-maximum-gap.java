class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        int max = 0;
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int num: nums){
        pq.offer(num);
      }
      while(pq.size() >= 2){
        int first = pq.poll();
        int second = pq.peek();

        if(second - first > max){
            max = second - first;
        }
      }
      return max;
    }
}