class Solution {
    public long countVowels(String word) {
        long count = 0;
       for(int i = 0; i < word.length(); i++){
        if(isVowel(word.charAt(i))){
            count += (long) (i + 1) * (word.length()-i);
        }
       }
       return count;
    }
    public static boolean isVowel(char ch){
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') return true;

       else{
        return false;
       }
    }
}