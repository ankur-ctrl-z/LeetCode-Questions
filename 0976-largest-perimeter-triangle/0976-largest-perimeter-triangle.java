class Solution {
    public int largestPerimeter(int[] arr) {
       Arrays.sort(arr);
       for(int i = arr.length-1; i >=2; i--){
        if(arr[i]+arr[i-1] > arr[i-2] && arr[i-2]+arr[i-1] > arr[i] && arr[i]+arr[i-2] > arr[i-1]){
            return arr[i] + arr[i-1] + arr[i-2];
        }
       } 
       return 0;
    }
}