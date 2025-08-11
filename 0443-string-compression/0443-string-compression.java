class Solution {
    public int compress(char[] arr) {
        int a = 0, b = 0;
        while (b < arr.length) {
            int c = b;
            while (b < arr.length && arr[b] == arr[c]) {
                b++;
            }
            arr[a++] = arr[c];
            int d = b - c;
            if (d > 1) {
                String s = Integer.toString(d);
                for (int e = 0; e < s.length(); e++) {
                    arr[a++] = s.charAt(e);
                }
            }
        }
        return a;
    }
}
