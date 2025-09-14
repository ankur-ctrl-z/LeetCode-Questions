import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();

        for (String word : wordlist) {
            exact.add(word);
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            vowelInsensitive.putIfAbsent(lower.replaceAll("[aeiou]", "#"), word);
        }

        String[] res = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                res[i] = q;
                continue;
            }
            String lower = q.toLowerCase();
            if (caseInsensitive.containsKey(lower)) {
                res[i] = caseInsensitive.get(lower);
                continue;
            }
            String vkey = lower.replaceAll("[aeiou]", "#");
            res[i] = vowelInsensitive.getOrDefault(vkey, "");
        }
        return res;
    }
}
