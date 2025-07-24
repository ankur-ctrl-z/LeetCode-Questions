class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int value: nums){
            if(iseven(value)){
                sum = sum + value;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
    private static boolean iseven(int num){
        if(num % 2 == 0 && num % 3 == 0) return true;
        return false;
    }
}