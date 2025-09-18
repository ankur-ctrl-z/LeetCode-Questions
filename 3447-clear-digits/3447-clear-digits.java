class Solution {
    public String clearDigits(String s) {
        StringBuilder st = new StringBuilder(s);
        for (int i = 1; i < st.length(); i++) {
            if (isDigit(st.charAt(i))) {  
                st.deleteCharAt(i);       
                st.deleteCharAt(i - 1);    
                i = Math.max(i - 2, 0);    
            }
        }
        return st.toString();
    }
    public static boolean isDigit(char ch1){
        if(ch1 == '0' || ch1 == '1' || ch1 == '2' || ch1 == '3' || ch1 == '4' || ch1 == '5' || ch1 == '6' || ch1 == '7' || ch1 == '8' || ch1 == '9'){
            return true;
        } else {
            return false;
        }
    }
}
