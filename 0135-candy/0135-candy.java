class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        if (n == 1) return 1;

        int[] candy = new int[n];
        Arrays.fill(candy, 1);

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        int ans = 0;
        for (int x : candy) {
            ans += x;
        }

        return ans;
    }
}