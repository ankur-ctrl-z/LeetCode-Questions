class Solution {
    public int trap(int[] arr) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        int maxleft = arr[0];
        int maxright = arr[arr.length-1];
        left[0] = arr[0];

        right[arr.length-1] = arr[arr.length-1];

        for(int i = 1; i < arr.length; i++){
            maxleft = Math.max(maxleft, arr[i]);
            left[i] = maxleft;
        }

        for(int i = arr.length -2; i >= 0; i--){
            maxright = Math.max(maxright,arr[i]);
            right[i] = maxright;
        }

        for(int i = 0; i < left.length; i++){
            int temp = arr[i];
            arr[i] = Math.min(left[i],right[i]);
            arr[i] = arr[i] - temp;
        }

        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}