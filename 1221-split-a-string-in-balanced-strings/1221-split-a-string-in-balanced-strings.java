class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0; // difference between L and R
        int count = 0;   // number of balanced strings

        for (char c : s.toCharArray()) {
            if (c == 'L') balance++;
            else balance--;

            if (balance == 0) { // balanced found
                count++;
            }
        }
        return count;
    }
}
