package Array;

public class Partition_Array_According_To_Given_Pivot {
    class Solution {
        public int[] pivotArray(int[] arr, int pivotValue) {
            int[] res = new int[arr.length];
            int idx = 0;

            for (int num : arr) {
                if (num < pivotValue) {
                    res[idx++] = num;
                }

            }
            for (int num : arr) {
                if (num == pivotValue) {
                    res[idx++] = num;
                }
            }

            for (int num : arr) {
                if (num > pivotValue) {
                    res[idx++] = num;
                }
            }

            return res;
        }
    }
}
