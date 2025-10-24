class Solution {
    public int nextBeautifulNumber(int n) {
        if(n == 1) return 22;
        n = n+1;
       boolean check = false;
       while(check == false){
       HashMap<Integer, Integer> map = new HashMap<>(); 
       String s = Integer.toString(n);
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        int num = Character.getNumericValue(ch);
        map.put(num,map.getOrDefault(num,0)+1);
       }
         if(ischeck(map) == true){
            return n;
         }
         n = n+1;
       }
       return n;
    }
    public static boolean ischeck(HashMap<Integer,Integer> map){
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
         if(entry.getKey() != entry.getValue()){
            return false;
         }
       }
        return true;
    }
}