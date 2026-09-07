class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n > 10) n = 10; 

        int total = 10; 
        int computed = 9; 
        int available = 9; 

        for (int i = 2; i <= n; i++) {
            computed *= available; 
            total += computed; 
            available--; 
        }

        return total;
    }
}