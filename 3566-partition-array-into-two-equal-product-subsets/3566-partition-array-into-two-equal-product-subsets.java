class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {

        long totalProduct = 1;

        for (int num : nums) {
            totalProduct *= num;
        }

        if (totalProduct != target * target) {
            return false;
        }

        List<Integer> remaining = new ArrayList<>();

        for (int num : nums) {
            remaining.add(num);
        }

        for (int i = 0; i < remaining.size(); i++) {

            int current = remaining.get(i);

            if (target % current != 0) {
                continue;
            }

            long required = target / current;

            remaining.remove(i);

            if (findProduct(remaining, required, 0)) {
                return true;
            }

            remaining.add(i, current);
        }

        return false;
    }

    private boolean findProduct(
            List<Integer> nums,
            long target,
            int start
    ) {

        if (target == 1) {
            return true;
        }

        for (int i = start; i < nums.size(); i++) {

            int current = nums.get(i);

            if (target % current != 0) {
                continue;
            }

            nums.remove(i);

            long remainingTarget = target / current;

            if (findProduct(nums, remainingTarget, i)) {
                return true;
            }

            nums.add(i, current);
        }

        return false;
    }
}