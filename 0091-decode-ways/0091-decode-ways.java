class Solution {
    static Map<String, Integer> memo;

    public int numDecodings(String s) {
        memo = new HashMap<>();
        return decodeString(new StringBuilder(s));
    }

    public static int decodeString(StringBuilder s) {
        String key = s.toString();
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (s.length() > 0 && s.charAt(0) == '0') {
            memo.put(key, 0);
            return 0;
        }

        if (s.length() == 0) {
            return 1;
        }

        int ways = 0;

        if (s.length() >= 1) {
            StringBuilder copy = new StringBuilder(s);
            ways += decodeString(copy.deleteCharAt(0));
        }

        if (s.length() >= 2) {
            int num = Integer.parseInt(s.substring(0, 2));
            if (num >= 10 && num <= 26) {
                StringBuilder copy2 = new StringBuilder(s);
                copy2.deleteCharAt(0);
                copy2.deleteCharAt(0);
                ways += decodeString(copy2);
            }
        }

        memo.put(key, ways);
        return ways;
    }
}