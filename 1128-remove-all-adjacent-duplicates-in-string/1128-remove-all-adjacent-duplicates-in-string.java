// class Solution {
//     public String removeDuplicates(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         for(int i =0; i < sb.length()-1; i++){
//             if (sb.charAt(i+1) != sb.charAt(i)) {
//                 continue;
//             }else {
//                 sb.deleteCharAt(i);
//                 sb.deleteCharAt(i);

//                 i = i-2;
//                 if (i < -1) i = -1;
//             }
//         }
//         return sb.toString();
//     }
// }





class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop(); 
            } else {
                st.push(ch); 
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}
