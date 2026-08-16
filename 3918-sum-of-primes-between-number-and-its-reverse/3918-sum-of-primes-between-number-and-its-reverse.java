class Solution {
    public int sumOfPrimesInRange(int n) {
        String s = Integer.toString(n);
        String reversed = new StringBuilder(s).reverse().toString();
        int rev = Integer.parseInt(reversed);
        
        int start = Math.min(n, rev);
        int end = Math.max(n, rev);
        
        int ans = 0;
        for (int i = start; i <= end; i++) {
           if (prime(i)) {
              ans += i;
           }
        }
        return ans;
    }

    public static boolean prime(int n) {
        if (n <= 1) return false; 
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }
}