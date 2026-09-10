class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 1;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        int i = 0;
        int j = 1;

        while (j < n) {
            if (arr[i] < arr[j]) {
                candies[j] = candies[i] + 1;
            }

            i++;
            j++;
        }

        i = n - 2;
        j = n - 1;

        while (i >= 0) {
            if (arr[i] > arr[j]) {
                candies[i] = Math.max(candies[i], candies[j] + 1);
            }

            i--;
            j--;
        }

        int ans = 0;

        for (int candy : candies) {
            ans += candy;
        }

        return ans;
    }

}
