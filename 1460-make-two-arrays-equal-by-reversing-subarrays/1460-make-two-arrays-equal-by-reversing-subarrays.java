class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length != target.length) return false;
        Arrays.sort(arr);
        Arrays.sort(target);
        for(int i = 0; i < arr.length; i++){
           if(arr[i] != target[i]) return false;
        }
        return true;
    }
}