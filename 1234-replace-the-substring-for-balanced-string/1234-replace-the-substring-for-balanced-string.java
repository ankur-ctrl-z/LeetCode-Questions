class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int k = n / 4;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if (map.getOrDefault('Q', 0) <= k && map.getOrDefault('W', 0) <= k && 
            map.getOrDefault('E', 0) <= k && map.getOrDefault('R', 0) <= k) {
            return 0;
        }

        int result = n;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.get(rightChar) - 1);

            while (left < n && 
                   map.getOrDefault('Q', 0) <= k && map.getOrDefault('W', 0) <= k && 
                   map.getOrDefault('E', 0) <= k && map.getOrDefault('R', 0) <= k) {
                
                result = Math.min(result, right - left + 1);
                
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) + 1);
                left++;
            }
        }
        
        return result;
    }
}
