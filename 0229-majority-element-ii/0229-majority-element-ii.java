class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=Integer.MIN_VALUE, ele2=Integer.MIN_VALUE;
        int l=nums.length;
        int count1=0, count2=0;
        for(int i=0;i<l;i++){
            if(count1==0 && ele2!=nums[i]){
                ele1=nums[i];
                count1++;
            }
            else if(count2==0 && ele1!=nums[i]){
                ele2=nums[i];
                count2++;
            }
            else if(ele1==nums[i]) count1++;
            else if(ele2==nums[i]) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(ele1==nums[i]) count1++;
            if(ele2==nums[i]) count2++;
        }
        if(count1>(l/3)) list.add(ele1);
        if(count2>(l/3)) list.add(ele2);
        return list;
    }
}



//class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int n = nums.length;
//        ArrayList<Integer> ll = new ArrayList<>(); 
//        HashMap<Integer,Integer> map = new HashMap<>();
//        double required = Math.floor(n/3);

//        for(int num: nums){
//         map.put(num,map.getOrDefault(num, 0) + 1);
//        }
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//         if(entry.getValue() > required){
//             ll.add(entry.getKey());
//         }
//        }
//        return ll;
//     }
// }