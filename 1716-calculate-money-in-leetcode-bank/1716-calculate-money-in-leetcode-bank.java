class Solution {
    public int totalMoney(int n) {
        int count = 1;
        int total = 0;
        int value = 1;
        int temp = 1;
        while(count <= n){
            int i = 1;
            while(i <= 7 && count <= n){
               total += value;
               value++; 
               count++;
               i++;
            }
            temp++;
            value = temp;
        }
        return total;
    }
}