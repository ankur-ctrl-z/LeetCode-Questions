class Solution {
    public int maxFreqSum(String str) {
HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { 
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        int maxVowel = 0;
        int maxConsonant = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (vowels.contains(ch)) {
                maxVowel = Math.max(maxVowel, freq);
            } else {
                maxConsonant = Math.max(maxConsonant, freq);
            }
        }

        int result = maxVowel + maxConsonant;

        return result;
    }
}