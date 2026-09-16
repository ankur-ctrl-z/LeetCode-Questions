class Solution {
    public String minInteger(String num, int k) {
        int n = num.length();

        List<Integer>[] pos = new List[10];
        for (int d = 0; d < 10; d++) pos[d] = new ArrayList<>();
        for (int i = 0; i < n; i++) pos[num.charAt(i) - '0'].add(i);
        int[] ptr = new int[10]; 

        int[] bit = new int[n + 2];
        StringBuilder res = new StringBuilder();

        for (int filled = 0; filled < n; filled++) {
            for (int d = 0; d < 10; d++) {
                if (ptr[d] >= pos[d].size()) continue;

                int orig = pos[d].get(ptr[d]);

                int sum = 0;
                for (int i = orig + 1; i > 0; i -= i & (-i)) sum += bit[i];
                int dist = orig - sum;

                if (dist <= k) {
                    k -= dist;
                    ptr[d]++;
                    res.append((char) ('0' + d));

                    for (int i = orig + 1; i <= n; i += i & (-i)) bit[i]++;

                    break;
                }
            }
        }
        return res.toString();
    }
}