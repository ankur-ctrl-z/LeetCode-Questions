class Solution {
    public int concatenatedBinary(int n) {
        long result = 0; 
        int MOD = 1_000_000_007; 

        for (int i = 1; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            
            for (char bit : binary.toCharArray()) {
                result = (result * 2 + (bit - '0')) % MOD;
            }
        }

        return (int) result;
    }
}
