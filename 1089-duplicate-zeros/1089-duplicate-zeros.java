class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
            if (num == 0) {
                list.add(0); 
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
