class Solution {
    public int[] productExceptSelf(int[] nums) {
        return Product(nums);
    }
    public static int[] Product (int [] arr) {
        int left[] = new int [arr.length];
        int right[] = new int[arr.length];
            left[0] = 1;
            right[arr.length-1] = 1;
            for(int i = 1; i < arr.length; i++){
                left[i] = left[i - 1] * arr[i - 1];
            }
            for(int i = arr.length-2; i >= 0; i--){
                right[i] = arr[i + 1] * right[i + 1];
            }

            for(int i = 0; i < left.length; i++){
                left[i] = left[i] * right[i];
            }

            return left;
    }
}