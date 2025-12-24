class Solution { 
    public int maxArea(int[] arr) {
       int i = 0;
       int j = arr.length-1; 
       int water = Integer.MIN_VALUE;
       int max = Integer.MIN_VALUE;
       while(i < j){
        if(arr[i] <= arr[j]){
            water = arr[i] * (j - i);
            max = Math.max(max, water);
            i++;
        } else{
            water = arr[j] * (j - i);
            max = Math.max(max, water);
            j--;
        }
       } 
       return max;
    }
}