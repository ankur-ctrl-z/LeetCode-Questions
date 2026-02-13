class Solution {
    static String ans = "";

    public boolean exist(char[][] arr, String word) {
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isexist(i, j, arr, word)) return true;
            }
        }
        return false;
    }

    public static boolean isexist(int i, int j, char[][] arr, String word) {
        if (ans.equals(word)) return true;

        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length) return false;
        if (ans.length() >= word.length()) return false;
        if (arr[i][j] != word.charAt(ans.length())) return false;

        char temp = arr[i][j];
        ans += temp;
        arr[i][j] = '#';

        boolean found =
                isexist(i + 1, j, arr, word) ||
                isexist(i - 1, j, arr, word) ||
                isexist(i, j + 1, arr, word) ||
                isexist(i, j - 1, arr, word);

        arr[i][j] = temp;
        ans = ans.substring(0, ans.length() - 1);

        return found;
    }
}

