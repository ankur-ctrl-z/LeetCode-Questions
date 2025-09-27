class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {   
                    double a = distance(points[i], points[j]);
                    double b = distance(points[j], points[k]);
                    double c = distance(points[k], points[i]);

                    double s = (a + b + c) / 2.0;

                    if (s > a && s > b && s > c) {
                        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
        }

        return maxArea;
    }

    private double distance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}
