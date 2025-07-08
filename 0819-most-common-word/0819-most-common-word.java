class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        Map<String, Integer> wordCounts = new HashMap<>();

        String normalizedParagraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]+", " ");

        String[] words = normalizedParagraph.trim().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty() && !bannedSet.contains(word)) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        return mostFrequentWord;
    }
}
