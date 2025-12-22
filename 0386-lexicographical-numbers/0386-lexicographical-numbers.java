class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> ll = new ArrayList<>();
        Lexicographical(n, 0, ll);
        return ll;
    }

    public static void Lexicographical(int n, int curr, ArrayList<Integer> ll) {
        if (curr > n) return;
        if (curr != 0) ll.add(curr);
        for (int i = (curr == 0 ? 1 : 0); i <= 9; i++) {
            int next = curr * 10 + i;
            if (next > n) break;
            Lexicographical(n, next, ll);
        }
    }
}
