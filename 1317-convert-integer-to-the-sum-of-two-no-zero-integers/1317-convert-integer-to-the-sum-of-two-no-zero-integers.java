class Solution {
    public int[] getNoZeroIntegers(int n) {
       int arr[] = new int[2];
       for(int i = 1; i <= n; i++){
        if(isZero(i) && isZero(n-i)){
            arr[0] = i;
            arr[1] = n-i;
        }
       }
       return arr;
    }   
    public static boolean isZero(int n){
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int num = ch - '0';
            if(num == 0){
                return false;
            }
        }
        return true;
    }    
}