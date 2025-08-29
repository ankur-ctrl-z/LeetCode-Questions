class Solution {
    public String restoreString(String s, int[] arr) {
       StringBuilder st = new StringBuilder(" ".repeat(s.length()));
       for(int i = 0; i < s.length(); i++){
        st.setCharAt(arr[i],s.charAt(i));
       } 
       return st.toString();
    }
}