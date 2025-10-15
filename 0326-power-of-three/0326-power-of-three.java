class Solution {
    public boolean isPowerOfThree(int n) {
       return recursion(0,n);
    }
    public static boolean recursion(int n,int a){
        if(a == Math.pow(3,n)) return true; 
        if(a < Math.pow(3,n)) return false;
        return recursion(n+1,a);
    }
}