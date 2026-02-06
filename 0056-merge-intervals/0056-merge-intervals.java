class Solution {
    public int[][] merge(int[][] arr) {
        if(arr.length <= 1){
            return arr;
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0])); 
        List<int[]> result = new ArrayList<>();
        int[] newInterval = arr[0];
        result.add(newInterval);

        for(int interval[] : arr){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}