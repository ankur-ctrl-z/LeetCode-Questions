class Solution {
    public int maxOperations(String s) {
        int count = 0;
        int onesCount = 0; 
        int i = 0;
        
        while(i < s.length()){
            if(s.charAt(i) == '1'){
                onesCount++; 
                i++;
            } else { 
                if(i > 0 && s.charAt(i-1) == '1'){
                    count += onesCount;
                }
                i++;
            }
        }
        return count;
    }
}