class Solution {
    public boolean isNStraightHand(int[] arr, int groupSize) {
        if (arr.length % groupSize != 0) {
            return false;
        }
        
        Arrays.sort(arr);
        boolean[] visited = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue; 
            }
            
            int curr = arr[i];
            visited[i] = true;
            int k = groupSize - 1;
            
            for (int j = i + 1; j < arr.length && k > 0; j++) {
                if (arr[j] == curr + 1 && !visited[j]) {
                    visited[j] = true; 
                    curr = arr[j];     
                    k--;               
                }
            }

            if (k > 0) {
                return false;
            }
        } 
        
        return true;
    }
}