import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                char rowVal = board[i][j];
                if (rowVal != '.') {
                    if (rowSet.contains(rowVal)) return false;
                    rowSet.add(rowVal);
                }

                char colVal = board[j][i];
                if (colVal != '.') {
                    if (colSet.contains(colVal)) return false;
                    colSet.add(colVal);
                }
            }
        }

        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {

                Set<Character> set = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char val = board[r + i][c + j];
                        if (val == '.') continue;
                        if (set.contains(val)) return false;
                        set.add(val);
                    }
                }
            }
        }

        return true;
    }
}