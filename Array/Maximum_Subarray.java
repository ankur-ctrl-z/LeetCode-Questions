package Array; 

public class Maximum_Subarray {
    class Solution {
        public int maxSubArray(int[] arr) {
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    ans = Math.max(ans, sum);
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            return ans;
        }
    }
}
