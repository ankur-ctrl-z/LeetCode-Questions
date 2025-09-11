class Solution {
    public int findUnsortedSubarray(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 0;

        int i = 0;
        int j = 1;

        int m = arr.length - 1;
        int n = arr.length - 2;

        int value1 = -1;
        int value2 = -1;

        // left boundary: first place where order breaks
        while (i < arr.length - 1) {
            if (arr[i] > arr[j]) {
                value1 = i;
                break;
            } else {
                i++;
                j++;
            }
        }

        // right boundary: first place from right where order breaks
        while (m > 0) {
            if (arr[m] < arr[n]) {
                value2 = m;
                break;
            } else {
                m--;
                n--;
            }
        }

        // already sorted
        if (value1 == -1 || value2 == -1) return 0;

        // find min and max inside the initial window and expand boundaries if needed
        int subMin = Integer.MAX_VALUE;
        int subMax = Integer.MIN_VALUE;
        for (int k = value1; k <= value2; k++) {
            subMin = Math.min(subMin, arr[k]);
            subMax = Math.max(subMax, arr[k]);
        }

        while (value1 > 0 && arr[value1 - 1] > subMin) value1--;
        while (value2 < arr.length - 1 && arr[value2 + 1] < subMax) value2++;

        return value2 - value1 + 1;
    }
}
