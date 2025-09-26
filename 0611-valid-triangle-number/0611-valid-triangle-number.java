class Solution {
    public int triangleNumber(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i], b = arr[j], c = arr[k];
                    if (a + b > c && a + c > b && b + c > a) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
