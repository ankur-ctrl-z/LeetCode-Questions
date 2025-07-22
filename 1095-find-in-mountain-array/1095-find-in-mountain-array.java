/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);
        
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;
        
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
    
    private int findPeakIndex(MountainArray arr) {
        int low = 0, high = arr.length() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;  
    }
    
    private int binarySearch(MountainArray arr, int target, int low, int high, boolean isAscending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = arr.get(mid);
            if (midVal == target) {
                return mid;
            }
            if (isAscending) {
                if (midVal < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {  
                if (midVal > target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
