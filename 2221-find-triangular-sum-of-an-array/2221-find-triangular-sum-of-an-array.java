class Solution {
    public int triangularSum(int[] arr) {
        ArrayList<Integer> ll = new ArrayList<>();
        for (int num : arr) {
            ll.add(num);
        }

        while (ll.size() != 1) {
            for (int i = 0; i < ll.size() - 1; i++) {
                int value = (ll.get(i) + ll.get(i + 1)) % 10;
                ll.set(i, value); 
            }
            ll.remove(ll.size() - 1);
        }

        return ll.get(0);
    }
}