class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // Each character can be a center of palindrome (odd and even length)
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            // Expand while it's palindrome
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}
