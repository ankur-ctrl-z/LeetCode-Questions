class Solution {
	public static int maxFreqSum(String s) {

		int n =  s.length();
		HashMap<Character, Integer>  hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer>  hm2 = new HashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {
			
			char ch =  s.charAt(i);
			
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
            	hm1.put(ch, hm1.getOrDefault(ch, 0)+1);
      
			}else {
            	hm2.put(ch, hm2.getOrDefault(ch, 0)+1);
			}
			
		}
		
		int count1 = 0;
		for(int c : hm1.values()) {
			count1 = Math.max(c, count1);
		}
		
		int count2 = 0;
		for(int c : hm2.values()) {
			count2 = Math.max(c, count2);
		}
		
		
		return count1 +  count2;
	}
}