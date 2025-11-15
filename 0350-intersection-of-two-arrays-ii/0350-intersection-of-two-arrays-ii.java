class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> ll = new ArrayList<>();
        
        if(nums1.length >= nums2.length){
            for(int i = 0; i < nums1.length; i++){
                ll.add(nums1[i]);
            }
            for(int num : nums2){
                if(ll.contains(num)){
                    result.add(num);
                    ll.remove((Integer)num);  
                }
            }
        } else {
            for(int i = 0; i < nums2.length; i++){
                ll.add(nums2[i]);
            }
            for(int num : nums1){
                if(ll.contains(num)){
                    result.add(num);
                    ll.remove((Integer)num);  
                }
            }
        }
        
        int finalresult[] = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            finalresult[i] = result.get(i);
        }

        return finalresult;
    }
}