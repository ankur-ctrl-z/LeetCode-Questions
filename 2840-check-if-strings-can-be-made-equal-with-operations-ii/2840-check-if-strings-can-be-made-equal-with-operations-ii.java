class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        StringBuilder s1Even = new StringBuilder(), s1Odd = new StringBuilder();
        StringBuilder s2Even = new StringBuilder(), s2Odd = new StringBuilder();
        
        // Extract characters
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s1Even.append(s1.charAt(i));
                s2Even.append(s2.charAt(i));
            } else {
                s1Odd.append(s1.charAt(i));
                s2Odd.append(s2.charAt(i));
            }
        }
        
        // Convert to arrays to sort
        char[] e1 = s1Even.toString().toCharArray();
        char[] e2 = s2Even.toString().toCharArray();
        char[] o1 = s1Odd.toString().toCharArray();
        char[] o2 = s2Odd.toString().toCharArray();
        
        Arrays.sort(e1); Arrays.sort(e2);
        Arrays.sort(o1); Arrays.sort(o2);
        
        return Arrays.equals(e1, e2) && Arrays.equals(o1, o2);
    }
}