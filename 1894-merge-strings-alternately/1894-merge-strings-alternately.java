class Solution {
    public String mergeAlternately(String s, String t) {
        StringBuilder u = new StringBuilder();
        int a = 0, b = 0;
        while (a < s.length() && b < t.length()) {
            u.append(s.charAt(a));
            u.append(t.charAt(b));
            a++;
            b++;
        }
        if (a < s.length()) {
            u.append(s.substring(a));
        }
        if (b < t.length()) {
            u.append(t.substring(b));
        }
        return u.toString();
    }
}
