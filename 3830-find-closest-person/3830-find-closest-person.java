class Solution {
    public int findClosest(int x, int y, int z) {
       int distance1 = 0;
       int distance2 = 0;

       if(x > z){
        distance1 = x-z;
       } else {
        distance1 = z-x;
       }

       if(y > z){
        distance2 = y-z;
       } else {
        distance2 = z-y;
       }

       if(distance1 > distance2){
        return 2;
       } else if(distance2 > distance1){
        return 1;
       } else {
        return 0;
       }
    }
}