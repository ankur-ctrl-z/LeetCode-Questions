class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);  
        
        int prefix = 0;
        int count = 0;
        
        for (int num : arr) {
            prefix += num;
            
            int rem = ((prefix % k) + k) % k;
            
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        
        return count;
    }
}



// class Solution {
//     public int subarraysDivByK(int[] arr, int k) {
//         int n = arr.length;
//         int count = 0;
//        int prefix[] = new int[n]; 
//        prefix[0] = arr[0];  
//        for(int i = 1; i < n; i++){
//         prefix[i] = prefix[i-1] + arr[i];
//        }

//        for(int i = 0; i < n; i++){
//         for(int j = i; j < n; j++){
//             int sum;
//             if(i==0) sum = prefix[j];
//            else sum = prefix[j] - prefix[i-1];
//             if(sum%k == 0) count++;
//         }
//        }
//        return count;
//     }
// }