class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        List<Long> stack = new ArrayList<>();

        for (int num : nums) {

            stack.add((long) num);

            while (stack.size() >= 2) {

                int n = stack.size();

                long last = stack.get(n - 1);
                long secondLast = stack.get(n - 2);

                if (last == secondLast) {

                    stack.remove(n - 1);
                    stack.remove(n - 2);

                    stack.add(last + secondLast);

                } else {
                    break;
                }
            }
        }

        return stack;
    }
}