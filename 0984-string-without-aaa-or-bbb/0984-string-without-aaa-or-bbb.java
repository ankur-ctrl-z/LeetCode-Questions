class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder st = new StringBuilder();

        while (a > 0 || b > 0) {
            if (a > b) {
                if (a >= 2) {
                    st.append("aa");
                    a -= 2;
                } else {
                    st.append("a");
                    a--;
                }
                if (b > 0) {
                    st.append("b");
                    b--;
                }
            } 
            else if (b > a) {
                if (b >= 2) {
                    st.append("bb");
                    b -= 2;
                } else {
                    st.append("b");
                    b--;
                }
                if (a > 0) {
                    st.append("a");
                    a--;
                }
            } 
            else {
                st.append("ab");
                a--;
                b--;
            }
        }

        return st.toString();
    }
}
