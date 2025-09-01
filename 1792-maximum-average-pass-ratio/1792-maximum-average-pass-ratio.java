class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double ga = gain(a[0], a[1]);
            double gb = gain(b[0], b[1]);
            return Double.compare(gb, ga); 
        });

        for (int[] c : classes) pq.offer(new int[]{c[0], c[1]});

        while (extraStudents-- > 0) {
            int[] top = pq.poll();
            top[0] += 1;
            top[1] += 1;
            pq.offer(top);
        }

        double sum = 0.0;
        for (int[] c : pq) sum += (double) c[0] / c[1];
        return sum / classes.length;
    }

    private double gain(int pass, int total) {
        return (double) (pass + 1) / (total + 1) - (double) pass / total;
    }
}