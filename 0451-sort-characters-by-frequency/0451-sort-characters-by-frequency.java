class Solution {
    public String frequencySort(String s) {
        StringBuilder st = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        map.entrySet()
   .stream()
   .sorted((a, b) -> b.getValue() - a.getValue()) 
   .forEach(entry -> {
       for (int i = 0; i < entry.getValue(); i++) {
           st.append(entry.getKey());
       }
   });
   return st.toString();
    }
}