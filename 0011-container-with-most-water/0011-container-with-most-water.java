class Solution { 
    public int maxArea(int[] arr) {
       int left = 0;
       int right = arr.length-1;
       int width = 0, hight = 0,ans = 0, finalans = 0;
       while(left < right){
        width = right - left;
        hight = Math.min(arr[left],arr[right]);
        ans = width * hight;
        finalans = Math.max(ans,finalans);
        if(arr[left] < arr[right]){
            left++;
        }else {
            right--;
        }
       }
       return finalans;
    }
}