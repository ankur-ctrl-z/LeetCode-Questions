class Solution {
    public boolean check(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
}