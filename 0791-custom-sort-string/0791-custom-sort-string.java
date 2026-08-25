class Solution {
    public String customSortString(String order, String s) {
        StringBuilder st2 = new StringBuilder(s);
        String ans = "";

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            int idx = st2.indexOf(String.valueOf(ch));
            while (idx != -1) {
                ans += ch;
                st2.deleteCharAt(idx);
                idx = st2.indexOf(String.valueOf(ch));
            }
        }
        return ans + st2.toString();
    }
}