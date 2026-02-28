import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Row check
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val == '.') continue;
                if (set.contains(val)) return false;
                set.add(val);
            }
        }

        // Column check
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char val = board[i][j];
                if (val == '.') continue;
                if (set.contains(val)) return false;
                set.add(val);
            }
        }

        // 3x3 grid check
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