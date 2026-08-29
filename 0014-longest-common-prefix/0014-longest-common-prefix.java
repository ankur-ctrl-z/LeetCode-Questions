class Solution {
    public String longestCommonPrefix(String[] arr) {
        String potential = arr[0];
        String ans = "";
        for(int i = 1; i < arr.length; i++){
           String check = arr[i];
           int j = 0;
           int small = Math.min(check.length(), potential.length());
           while(j < small){
            if(check.charAt(j) == potential.charAt(j)){
                ans += check.charAt(j);
            } else {
                break;
            }
            j++;
           }
           potential = ans;
           ans = "";
        }
        return potential;
    }
}