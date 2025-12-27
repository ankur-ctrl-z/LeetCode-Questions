class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        backtrack(s, ll, result);
        return result;
    }

    private void backtrack(String s, List<String> ll, List<List<String>> result) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String ans = s.substring(0, i + 1);

            if (isPalindrome(ans)) {
                ll.add(ans);
                backtrack(s.substring(i + 1), ll, result);
                ll.remove(ll.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}