class Solution {
    public boolean isPowerOfFour(int n) {
        return recur(0,n);
    }
    public static boolean recur(int n, int target){
        if(Math.pow(4,n) == target) return true;
        if(Math.pow(4,n) > target) return false;
        return recur(n+1,target);
    }
}