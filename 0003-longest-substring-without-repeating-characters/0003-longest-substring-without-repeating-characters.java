class Solution {  
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set = new HashSet<>();

    int i = 0, j = 0;
    int maxLen = 0;

    while (j < s.length()) {
        char c = s.charAt(j);

        if (!set.contains(c)) {
            set.add(c);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        } else {
            set.remove(s.charAt(i));
            i++;
        }
    }

    return maxLen;
}

}