class Solution {
    public int buyChoco(int[] arr, int money) {
        Arrays.sort(arr);
        int left = money;
        for(int i = 0; i <= 1; i++){
            left = left-arr[i]; 
        }
        if(left >= 0){
            return left;
        }
        return money;
    }
}