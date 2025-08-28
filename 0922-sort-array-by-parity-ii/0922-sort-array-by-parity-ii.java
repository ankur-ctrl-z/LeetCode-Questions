class Solution {
    public int[] sortArrayByParityII(int[] arr) {
       int i =0;
       int j = 1;
       while(j < arr.length -1; && i < arr.length){
          if(isEven(arr[i])){
            arr[i] = arr[i];
            i = i+2;
          }else{
            arr[j] = arr[i];
            j = j+2;
          }
       }
       return arr;
       public static boolean isEven(int num){
        return (num%2 == 0) ? true : false;
       }
    }
}