class Solution {
    public int maximum69Number (int num) {
       StringBuilder st = new StringBuilder(Integer.toString(num));
       for(int i = 0; i < st.length(); i++){
         if(st.charAt(i) == '6'){
            st.setCharAt(i, '9');
            break;
         }
       }
       return Integer.parseInt(st.toString());
    }
}