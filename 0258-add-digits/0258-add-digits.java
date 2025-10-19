class Solution {
    public int addDigits(int num) {
    String s = Integer.toString(num);
    int result = 0;
    while(s.length() != 1){
       for(int i = 0; i < s.length(); i++){
          result += s.charAt(i) - '0';
       }
       s = Integer.toString(result);
       result = 0;
    }
    return Integer.parseInt(s);
    }
}