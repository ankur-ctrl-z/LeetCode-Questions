class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse(); 
            result.append(reversedWord);

            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}