class Solution {
    public String shiftingLetters(String s, int[] arr) {
        char result[] = s.toCharArray();
        int n = s.length();

        long suffix = 0;

        for (int i = n - 1; i >= 0; i--) {
            suffix = (suffix + arr[i]) % 26;

            result[i] = (char)(((result[i] - 'a' + suffix) % 26) + 'a');
        }

        return new String(result);
    }
}



