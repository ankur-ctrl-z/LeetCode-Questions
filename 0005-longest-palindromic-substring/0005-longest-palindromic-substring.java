class Solution {
public String longestPalindrome(String s) {
    int n = s.length();
    if (n <= 1) return s;

    for (int len = n; len > 0; len--) {
        for (int i = 0; i + len - 1 < n; i++) {
            int j = i + len - 1;

            if (isPalindrome(s, i, j)) {
                return s.substring(i, j + 1);
            }
        }
    }

    return "";
}

private boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
}
}