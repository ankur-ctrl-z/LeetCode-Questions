class Solution {
    public String reversePrefix(String word, char ch) {
       int value = -1;
       StringBuilder st = new StringBuilder(word);
       for(int i = 0; i < word.length(); i++){
        if(ch == word.charAt(i)){
           value = i;
           break;
        }
       }
       if(value == -1){
        return word;
       } 
       reverse(st,value);
       return st.toString();
    }
    public static void reverse(StringBuilder sb, int j){
        int i = 0;
        while (i <= j) {
          char temp = sb.charAt(i);
          sb.setCharAt(i, sb.charAt(j));
          sb.setCharAt(j, temp);
          i++;
          j--;
        }
    }
}