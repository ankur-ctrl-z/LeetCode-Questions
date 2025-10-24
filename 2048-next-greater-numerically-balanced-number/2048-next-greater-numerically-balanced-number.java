class Solution {
    public int nextBeautifulNumber(int n) {
        int result = n + 1;
        boolean isBalanced = true;

        while(true) {
            String numAsString = Integer.toString(result);
            int[] balanceArr = new int[10];
            for (char digit : numAsString.toCharArray()) {
                balanceArr[Character.getNumericValue(digit)]++;
            }

            isBalanced = true;

            for (int i = 0; i < 10; i++) {
                if (balanceArr[i] != i && balanceArr[i] != 0) {
                    isBalanced = false;
                    result++;
                    break;
                }
            }

            if (isBalanced) {
                return result;
            }
            
        }

        // return -1;
    }
}