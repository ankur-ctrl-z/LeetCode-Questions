class Solution {
    public int canBeTypedWords(String text, String broken) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (char c : broken.toCharArray()) {
            set.add(c);
        }

        String[] words = text.split(" ");

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (set.contains(c)) {
                    count++;
                    break;
                }
            }
        }

        return words.length - count;
    }
}