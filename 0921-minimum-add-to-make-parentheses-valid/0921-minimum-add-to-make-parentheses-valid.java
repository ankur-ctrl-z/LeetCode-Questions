class Solution {
    public int minAddToMakeValid(String s) {
       char arr[] = s.toCharArray();
       int opening = 0;
       int closing = 0;
       int count = 0;

       for(char ch: arr) {
         if(ch == ')' && opening > 0) {
            opening--;
         } else if(ch == ')' && opening <= 0) {
            closing++;
         } else if(ch == '('){
            opening++;
         } else {
            continue;
         }
       }
       return opening + closing;

    //    return 0;
    }
}