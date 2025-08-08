class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (k < spaces.length && spaces[k] == i) {
                result.append(' ');
                k++;
            }
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}