class Solution {
    public int[] sortArrayByParityII(int[] arr) {
       int i =0;
       int j = 1;
       while(j < arr.length && i < arr.length){
          if(isEven(arr[i])){
            i = i+2;
          } else if(!isEven(arr[j])){
            j = j + 2;
          }
          else{
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i +=2;
            j+= 2;
          }
       }
       return arr;
    }   
       public static boolean isEven(int num){
        return (num%2 == 0) ? true : false;
       }
}