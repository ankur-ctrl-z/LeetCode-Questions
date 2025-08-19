class Solution {    
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0]  = firstOccurrence(nums,target);
        arr[1] = lastOccurrence(nums,target);

        return arr;
    }
    public static int firstOccurrence(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    int result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            result = mid;       // store answer
            high = mid - 1;     // move left for first occurrence
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return result;
}
public static int lastOccurrence(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    int result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            result = mid;       // store answer
            low = mid + 1;      // move right for last occurrence
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return result;
}

}