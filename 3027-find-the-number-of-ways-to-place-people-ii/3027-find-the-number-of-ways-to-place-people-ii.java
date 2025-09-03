class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; 
            }
            return a[0] - b[0]; 
        });
        
        int pairCount = 0;
        int n = points.length;
        
        for (int i = 0; i < n; i++) {
            int aliceX = points[i][0];
            int aliceY = points[i][1];
            int maxY = Integer.MIN_VALUE; 
            
            for (int j = i + 1; j < n; j++) {
                int bobX = points[j][0];
                int bobY = points[j][1];
                
                if (bobY <= aliceY && bobY > maxY) {
                    maxY = bobY; 
                    pairCount++; 
                }
            }
        }
        
        return pairCount;
    }
}