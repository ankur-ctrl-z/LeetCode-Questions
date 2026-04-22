import java.util.*;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        // frequency count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // greedy: always start from smallest available
        while (!map.isEmpty()) {
            int start = map.firstKey();

            for (int i = 0; i < k; i++) {
                int curr = start + i;

                if (!map.containsKey(curr)) {
                    return false;
                }

                map.put(curr, map.get(curr) - 1);

                if (map.get(curr) == 0) {
                    map.remove(curr);
                }
            }
        }

        return true;
    }
}