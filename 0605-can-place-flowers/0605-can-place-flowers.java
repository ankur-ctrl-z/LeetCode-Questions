class Solution {
    public boolean canPlaceFlowers(int[] arr, int a) {
        int b = 0;
        for (int c = 0; c < arr.length; c++) {
            if (arr[c] == 0 && (c == 0 || arr[c - 1] == 0) && (c == arr.length - 1 || arr[c + 1] == 0)) {
                arr[c] = 1;
                b++;
            }
        }
        return b >= a;
    }
}
