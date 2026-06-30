class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // Iterate over each input string
        for (String s: strs) {
            map.computeIfAbsent(computeKey(s), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private String computeKey(String str) {
        int[] countMap = new int[26];
        
        // Calculate count map
        for (char c: str.toCharArray()) {
            countMap[c - 'a']++;
        }

        // Convert to string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (countMap[i] > 0) {
                sb.append((char)(i + 'a')).append(countMap[i]);
            }
        }
        return sb.toString();
    }
}