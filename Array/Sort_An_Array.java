package Array;

public class Sort_An_Array {
    class Solution {
        public int[] sortArray(int[] arr) {
            quickSort(arr, 0, arr.length - 1);
            return arr;
        }

        public void quickSort(int[] arr, int si, int ei) {
            if (si >= ei)
                return;
            int idx = partition(arr, si, ei);
            quickSort(arr, si, idx - 1);
            quickSort(arr, idx + 1, ei);
        }

        public int partition(int[] arr, int si, int ei) {
            int pivot = arr[ei];
            int idx = si;
            for (int i = si; i < ei; i++) {
                if (arr[i] < pivot) {
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                    idx++;
                }
            }
            int temp = arr[ei];
            arr[ei] = arr[idx];
            arr[idx] = temp;
            return idx;
        }
    }

}
