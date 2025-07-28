class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int[] numbers = new int[nums.length + 1];
        for (int num : nums) {
            numbers[num]++;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                answer.add(i);
            }
        }
        return answer;
    }
}