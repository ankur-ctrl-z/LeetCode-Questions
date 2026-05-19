class Solution {
    public int maximumSwap(int num) {

        char[] arr = String.valueOf(num).toCharArray();

        int[] last = new int[10];

        for (int i = 0; i < arr.length; i++) {
            last[arr[i] - '0'] = i;
        }

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i] - '0';

            for (int d = 9; d > current; d--) {

                if (last[d] > i) {

                    char temp = arr[i];
                    arr[i] = arr[last[d]];
                    arr[last[d]] = temp;

                    return Integer.parseInt(new String(arr));
                }
            }
        }

        return num;
    }
}