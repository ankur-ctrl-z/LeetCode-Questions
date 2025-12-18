class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        
        for (int i = 1; i <= 10000; i++) {            
            prefix[0] = i + nums[0];
            if (prefix[0] < 1) continue;    
            
            boolean ok = true;
            
            for (int j = 1; j < n; j++) {
                prefix[j] = prefix[j - 1] + nums[j];
                if (prefix[j] < 1) {        
                    ok = false;
                    break;
                }
            }
            
            if (ok) return i;     
        }
        
        return 1;
    }
}
