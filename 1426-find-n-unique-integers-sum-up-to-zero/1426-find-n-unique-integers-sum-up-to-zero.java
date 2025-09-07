class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> ll = new ArrayList<>();
        if(n % 2 == 0){
            for(int i =1; i <= n/2; i++){
                ll.add(-i);
                ll.add(i);
            }
            }else {
                ll.add(0);
            for(int i =1; i <= n/2; i++){
                ll.add(-i);
                ll.add(i);
            }
        }
        int result[]  = new int [n];
        for(int i =0; i < n; i++){
            result[i] = ll.get(i);
        }
        return result;
    }
}