class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar = (int) target;
        char result = 'a';
        for(int value: letters){
            int num = (int) value;

            if(target < num){
                result = (char) num;
                return result;
            }
        }
        return letters[0];
    }
}