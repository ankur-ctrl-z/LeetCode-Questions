class Solution {
    public int maxProfit(int[] arr) {
        int pick = arr[0];   // Current buying price
        int profit = 0;
        int j = 1;           // Start from second day

        while (j < arr.length) {
            // Find the next buying point (valley)
            while (j < arr.length && arr[j] <= pick) {
                pick = arr[j];
                j++;
            }

            // Find the selling point (peak)
            int sell = pick;
            while (j < arr.length && arr[j] >= sell) {
                sell = arr[j];
                j++;
            }

            // Add profit from this transaction
            profit += sell - pick;

            // Set pick for the next transaction if not at the end
            if (j < arr.length) {
                pick = arr[j];
            }
        }
        return profit;
    }
}
