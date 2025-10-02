class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a = numBottles;
        while(numBottles >= numExchange){
            int newb = numBottles/numExchange;
            int rem = numBottles%numExchange;
            a += newb;
            numBottles = newb +  rem;
        }
        return a;
    }
}