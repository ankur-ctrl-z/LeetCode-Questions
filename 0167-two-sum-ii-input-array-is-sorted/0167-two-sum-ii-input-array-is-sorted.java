class Solution {
    public int[] twoSum(int[] arr, int target) {
        int result[] = new int[2];
       int i =0;
       int j = arr.length-1;
       while( i < j){
        if(arr[i] == arr[j]){
            i++;
        }
        int sum = arr[i] + arr[j];
        if(sum == target){
           result[0] = i + 1;
           result[1] = j + 1;

           return result;
        } else if(sum < target){
            i++;
        } else {
            j--;
        }
       }
       return result;
    }
}