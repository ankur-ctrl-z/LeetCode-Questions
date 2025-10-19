class Solution {
    public long[] sumOfThree(long num) {
        long[] arr = new long[3];
        long temp = 0;
        temp = num /3;
        if(num % 3 == 0){
          arr[0] = temp-1;
          arr[1] = temp;
          arr[2] = temp+1;
        } else {
            return new long[0];
        }
        return arr;
    }
}