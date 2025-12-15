class Solution {
    public int fib(int n) {
        return calculatefibo(n);
    }
    public static int calculatefibo(int n) {
        if(n == 1 || n == 0){
            return n;
        }
        return calculatefibo(n-1) + calculatefibo(n-2);
    }
}