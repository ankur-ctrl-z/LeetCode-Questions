class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;   
        int exchange = numBottles; 

        while (exchange >= numExchange) {
            exchange -= numExchange;  
            numExchange++;           
            total++;                
            exchange++;               
        }

        return total;
    }
}

