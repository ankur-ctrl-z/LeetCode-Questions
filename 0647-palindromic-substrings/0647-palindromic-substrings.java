class Solution {
    public int countSubstrings(String str) {
        int count = 0;
    for (int i = 0; i < str.length(); i++) {
        for (int j = i; j < str.length(); j++) {
            String sub = str.substring(i, j + 1);
            if(ispalindrome(sub)) count++;
            }
        }
        return count;
    }
    public static boolean ispalindrome(String s){
        if(s.length() == 1) return true;
        int i = 0;
        int j = s.length()-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            } 
            i++;
            j--;
        }
        return true;
    }
}