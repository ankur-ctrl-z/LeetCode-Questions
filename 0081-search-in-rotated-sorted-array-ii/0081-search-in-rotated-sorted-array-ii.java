class Solution {
    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
            low++;
            high--;
        }
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            } else {
                if(target > mid && target <= arr[high]){
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}