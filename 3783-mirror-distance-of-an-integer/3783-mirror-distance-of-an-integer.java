class Solution {
    public int mirrorDistance(int n) {
      String s = Integer.toString(n);
      StringBuilder ans = new StringBuilder();
      for(int i = s.length()-1; i >= 0; i--) {
         ans.append(s.charAt(i));
      }
    //   for(int i = 0; i < ans.length(); i++){
    //     if(ans.charAt(i) == '0'){
    //         ans.deleteCharAt(i);
    //     } else {
    //         break;
    //     }
    //   }
      return Math.abs(n - Integer.parseInt(ans.toString()));
    }
}