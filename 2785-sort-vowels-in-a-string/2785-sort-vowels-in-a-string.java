class Solution {
    public String sortVowels(String s) {
       char[] charArray = s.toCharArray();
       List<Integer> ll = new ArrayList<>();
       for(int i = 0; i < charArray.length; i++){
        if(isVowel(charArray[i])){
            ll.add((int) charArray[i]);
        }
        }

        Collections.sort(ll);

        int idx = 0;
        for (int i = 0; i < charArray.length; i++) {
           if(isVowel(charArray[i])){
            charArray[i] = (char) (int) ll.get(idx++);
           }
        }
        String str = new String(charArray);
        return str;
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' ||ch == 'O' || ch == 'u' || ch == 'U'){
            return true;
        } else {
            return false;
        }
    }
}