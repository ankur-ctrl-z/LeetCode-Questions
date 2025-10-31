class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for(int i = 0;i< nums.length; i++) {
            if(hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }

        int number = 0;
        // Get the Set of keys
        Set<Integer> keys = hashMap.keySet();
        Iterator<Integer> iterator = keys.iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if(hashMap.get(key) != 3) {
                number = key;
                break;
            }
        }
        return number;
    }
}