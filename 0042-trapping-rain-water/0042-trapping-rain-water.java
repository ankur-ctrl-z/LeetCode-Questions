class Solution {
    public int trap(int[] height) {
     return trapping(height); 
    }
    public static int trapping(int[] arr) {
        int n = arr.length;
        if(n==0) return 0;
        int left[] = new int[n];
        int right[] = new int[n];

        // finding left most maximum
        left[0] = arr[0];
        for(int i =1; i < n; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int j = n-2; j >= 0; j--){
            right[j] = Math.max(arr[j],right[j+1]);
        }

        int sum = 0;
        for(int k = 0; k < n; k++){
            sum += Math.min(right[k],left[k])-arr[k];
        }
        return sum;
    }

}