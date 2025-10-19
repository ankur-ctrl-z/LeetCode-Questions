class Solution {
    public int addDigits(int num) {
        int result = 0;
        while(num > 9){
            while(num > 0){
            result += num % 10;
            num /= 10;
            }
            num = result;
            result = 0;
        }
        return num;
    }
}