class Solution {
    public boolean exist(char[][] arr, String word) {
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isexist(i, j, 0, arr, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isexist(int i, int j, int idx, char[][] arr, String word) {
        if (idx == word.length()) return true;

        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length ||
            arr[i][j] != word.charAt(idx)) {
            return false;
        }

        char temp = arr[i][j];
        arr[i][j] = '#';

        boolean found =
                isexist(i + 1, j, idx + 1, arr, word) ||
                isexist(i - 1, j, idx + 1, arr, word) ||
                isexist(i, j + 1, idx + 1, arr, word) ||
                isexist(i, j - 1, idx + 1, arr, word);

        arr[i][j] = temp;
        return found;
    }
}
