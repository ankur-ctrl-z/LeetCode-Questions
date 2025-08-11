class Solution {
    public String gcdOfStrings(String s, String t) {
        if (!(s + t).equals(t + s)) return "";
        int a = gcd(s.length(), t.length());
        return s.substring(0, a);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
