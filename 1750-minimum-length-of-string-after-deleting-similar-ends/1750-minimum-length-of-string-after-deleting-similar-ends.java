class Solution {
    public int minimumLength(String s) {
        StringBuilder st = new StringBuilder(s);

        while (st.length() > 1) {
            int i = 0;
            int j = st.length() - 1;

            if (st.charAt(i) != st.charAt(j)) {
                break;
            }

            char ch = st.charAt(i);

            while (st.length() > 0 && st.charAt(0) == ch) {
                st.deleteCharAt(0);
            }

            while (st.length() > 0 && st.charAt(st.length() - 1) == ch) {
                st.deleteCharAt(st.length() - 1);
            }
        }

        return st.length();
    }
}
