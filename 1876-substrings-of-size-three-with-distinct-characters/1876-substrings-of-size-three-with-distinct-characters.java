class Solution { 
    public int countGoodSubstrings(String s) { 
        int i = 0; 
        int k = 2; 
        int count = 0; 
        
        while (i <= s.length() - 2) { 
            HashSet<Character> set = new HashSet<>(); 
            set.add(s.charAt(i)); 
            int j = i + 1; 
            
            while (j < s.length() && k > 0) { 
                if (!set.contains(s.charAt(j))) { 
                    set.add(s.charAt(j)); 
                    j++; 
                    k--; 
                } else { 
                    break; 
                } 
            } 
            
            if (k == 0) {
                count++;
            }
            
            i++; 
            k = 2; 
        } 
        return count; 
    } 
}
