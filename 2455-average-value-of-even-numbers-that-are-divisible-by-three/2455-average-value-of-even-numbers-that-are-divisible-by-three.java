class Solution {
    public int averageValue(int[] nums) {
        int sum = 0, count = 0;
        for (int x : nums) {
            if (x % 6 == 0) {
                sum += x;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
}
