class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a = numBottles;
        while (numBottles >= numExchange) {   
            int newBottles = numBottles / numExchange;  
            int remainder = numBottles % numExchange;   
            a += newBottles;
            numBottles = newBottles + remainder;      
        }
        return a;
    }
}
