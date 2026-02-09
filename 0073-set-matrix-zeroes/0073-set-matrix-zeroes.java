class Solution {
    public void setZeroes(int[][] arr) {
        int ROWS = arr.length;
        int COLS = arr[0].length;
        int FLAG = -1000001; 

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (arr[i][j] == 0) {
                    for (int c = 0; c < COLS; c++) {
                        if (arr[i][c] != 0) arr[i][c] = FLAG;
                    }
                    for (int r = 0; r < ROWS; r++) {
                        if (arr[r][j] != 0) arr[r][j] = FLAG;
                    }
                }
            }
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (arr[i][j] == FLAG) arr[i][j] = 0;
            }
        }
    }
}
