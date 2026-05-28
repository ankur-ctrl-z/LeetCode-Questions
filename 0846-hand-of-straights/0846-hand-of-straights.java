import java.util.Arrays;

class Solution {
    public boolean isNStraightHand(int[] arr, int groupSize) {
        // Quick check: If cards can't be evenly divided into groups, it's impossible
        if (arr.length % groupSize != 0) {
            return false;
        }
        
        // Sort the array so we can find consecutive elements linearly
        Arrays.sort(arr);
        boolean[] visited = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            // Skip if this card was already picked up by a previous group
            if (visited[i]) {
                continue; 
            }
            
            int curr = arr[i];
            visited[i] = true;
            int k = groupSize - 1; // We need groupSize - 1 more cards to finish this group
            
            // Look ahead to find the rest of the consecutive cards for THIS group
            for (int j = i + 1; j < arr.length && k > 0; j++) {
                if (arr[j] == curr + 1 && !visited[j]) {
                    visited[j] = true; 
                    curr = arr[j];     
                    k--;               
                }
            }
            
            // FIX: If k > 0, it means we couldn't find enough cards to finish the group.
            // Return false immediately because a card is left stranded.
            if (k > 0) {
                return false;
            }
        } 
        
        // If the loop finishes completely, it means EVERY group was successfully formed!
        return true;
    }
}