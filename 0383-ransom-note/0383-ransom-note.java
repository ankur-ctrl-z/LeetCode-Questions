class Solution {
    public boolean canConstruct(String s1, String s2) {
        int[] charCount = new int[26]; 

        for (char c : s2.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : s1.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--; 
        }

        return true; 
    }
}