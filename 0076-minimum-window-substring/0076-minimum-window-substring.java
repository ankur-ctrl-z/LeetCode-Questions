// class Solution {
//     public String minWindow(String s, String t) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         StringBuilder result = new StringBuilder();
//         boolean isAvailable = false;
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < t.length(); i++) {
//             char ch = t.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         int lengthoft = t.length();
//         String test = "";
//         for (int i = 0; i < s.length(); i++) {
//             if(map.containsKey(s.charAt(i)) && lengthoft > 0) {
//                 isAvailable = true;
//                 test += s.charAt(i);
//                 lengthoft--;
//                 int count = map.get(s.charAt(i));
//                 if (count == 1) {
//                     map.remove(s.charAt(i));
//                 } else {
//                     map.put(s.charAt(i), count - 1);
//                 }
//             } else if(isAvailable == true && lengthoft > 0){
//                 test += s.charAt(i);
//             } else if(lengthoft <= 0){
//                 if(result.length() > test.length()){
//                    result.setLength(0);
//                    result.append(test);
//                 }
//             }
//         }
//         return result.toString();
//     }
// }

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int required = t.length();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char rc = s.charAt(right);
            if (map.containsKey(rc)) {
                if (map.get(rc) > 0) required--;
                map.put(rc, map.get(rc) - 1);
            }
            right++;

            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char lc = s.charAt(left);
                if (map.containsKey(lc)) {
                    map.put(lc, map.get(lc) + 1);
                    if (map.get(lc) > 0) required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
