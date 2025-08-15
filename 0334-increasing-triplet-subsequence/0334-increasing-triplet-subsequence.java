class Solution {
    public boolean increasingTriplet(int[] arr) {
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
           if(arr[i] <= smallest){
            smallest = arr[i];
           }else if(arr[i] <= second){
            second = arr[i];
           } else if(arr[i] > second){
            return true;
           }
        }
        return false;
    }
}