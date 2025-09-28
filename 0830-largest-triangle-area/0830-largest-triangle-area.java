class Solution {
    public double largestTriangleArea(int[][] arr) {
        int n = arr.length;
        double maxArea = 0.0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = shoelace(arr[i], arr[j], arr[k]);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private double shoelace(int[] p1, int[] p2, int[] p3) {
        return 0.5 * Math.abs(
            p1[0]*(p2[1]-p3[1]) +
            p2[0]*(p3[1]-p1[1]) +
            p3[0]*(p1[1]-p2[1])
        );
    }
}


