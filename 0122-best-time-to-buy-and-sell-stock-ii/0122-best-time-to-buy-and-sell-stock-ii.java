// class Solution {
//     public int maxProfit(int[] arr) {
//         int pick = arr[0];   
//         int profit = 0;
//         int j = 1;           

//         while (j < arr.length) {
//             while (j < arr.length && arr[j] <= pick) {
//                 pick = arr[j];
//                 j++;
//             }

//             int sell = pick;
//             while (j < arr.length && arr[j] >= sell) {
//                 sell = arr[j];
//                 j++;
//             }

//             profit += sell - pick;

//             if (j < arr.length) {
//                 pick = arr[j];
//             }
//         }
//         return profit;
//     }
// }



class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}

