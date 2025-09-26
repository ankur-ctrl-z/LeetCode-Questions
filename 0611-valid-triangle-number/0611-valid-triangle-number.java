class Solution {
    public int triangleNumber(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;

        for (int c = n - 1; c >= 2; c--) {
            int left = 0;
            int right = c - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[c]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
}
