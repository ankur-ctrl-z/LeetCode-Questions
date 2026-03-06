class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        int i = 0;
        int j  = 1;

        while(j < s.length()) {
           if(s.charAt(i) == '1' && s.charAt(j) == '0'){
              count++;
           } else if(s.charAt(j) == '1' && s.charAt(i) == '0'){
            count++;
           }
           i++;
           j++;
        }
        return count > 1 ? false : true;
    }
}