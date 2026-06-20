class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Integer occurrence = charCount.get(s.charAt(i));
            if (occurrence != null) {
                charCount.put(s.charAt(i), occurrence + 1);
            } else {
                charCount.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            char curChar = t.charAt(i);
            Integer occurrence = charCount.get(curChar);
            if (occurrence == null) {
                return false;
            } else {
                charCount.put(curChar, occurrence - 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
