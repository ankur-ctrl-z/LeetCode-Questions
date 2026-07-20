class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }
        
        int count = 0;
        
        while (!q.isEmpty()) {
            int poll = q.poll();

            tickets[poll]--;
            count++;

            if (poll == k && tickets[k] == 0) {
                return count;
            }

            if (tickets[poll] > 0) {
                q.offer(poll);
            }
        }
        
        return count;
    }
}