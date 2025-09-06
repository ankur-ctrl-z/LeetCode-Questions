// class Solution {
//     public int buyChoco(int[] arr, int money) {
//         Arrays.sort(arr);
//         int left = money;
//         for(int i = 0; i <= 1; i++){
//             left = left-arr[i]; 
//         }
//         if(left >= 0){
//             return left;
//         }
//         return money;
//     }
// }


class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;  // smallest
        int min2 = Integer.MAX_VALUE;  // second smallest

        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }

        int total = min1 + min2;
        if (total <= money) {
            return money - total;
        }
        return money;
    }
}
