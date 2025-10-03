class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a = numBottles;
        while (numBottles >= numExchange) {   // ✅ fix 1
            int newBottles = numBottles / numExchange;  // ✅ fix 2
            int remainder = numBottles % numExchange;   // ✅ fix 3
            a += newBottles;
            numBottles = newBottles + remainder;        
        }
        return a;
    }
}
