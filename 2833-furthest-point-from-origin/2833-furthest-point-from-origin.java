class Solution {
    public int furthestDistanceFromOrigin(String moves) {
       int i = 0;
       int l = 0, r = 0, dash = 0;
       while(i < moves.length()) {
         if(moves.charAt(i) == 'L'){
            l++;
         } else if(moves.charAt(i) == 'R') {
            r++;
         }else{
            dash++;
         }
         i++;
       }
       return Math.abs(l-r)+dash;
    }
}