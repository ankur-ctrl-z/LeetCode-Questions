class Solution {
    public int fib(int n) {
       return fibonacci(n);
    }
    public static int fibonacci(int n){
        if(n == 1 || n == 0){
          return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}