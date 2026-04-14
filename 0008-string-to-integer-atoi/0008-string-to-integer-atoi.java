class Solution {
    ArrayList<Character> ll = new ArrayList<>();

    public Solution() {
        for (int i = 0; i <= 9; i++) {
            ll.add((char) (i + '0'));
        }
    }

    public int myAtoi(String s) {
        return checkTheString(s);
    }

    public int checkTheString(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        s = s.trim();
        String result = "";

        if (s.isEmpty()) {
            return 0;
        }

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            result += s.charAt(0);
        } else if (!ll.contains(s.charAt(0))) {
            return 0;
        }

        for (int i = (s.charAt(0) == '-' || s.charAt(0) == '+') ? 1 : 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ll.contains(ch)) {
                result += ch;
            } else if (!result.equals("")) {
                break;
            } else {
                return 0;
            }
        }

        if (result.equals("") || result.equals("+") || result.equals("-")) {
            return 0;
        }

        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return result.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
