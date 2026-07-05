

class Solution {
    private final String DELIM = "$";
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s: strs) {
            sb.append(DELIM);
            sb.append(s.length());
            sb.append(DELIM);
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str == null) {
            return null;
        }
        List<String> res = new ArrayList<>();

        int i = 0;
        int currWordLength = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (String.valueOf(ch).equals(DELIM)) {
                ch = str.charAt(++i);
                while (!String.valueOf(ch).equals(DELIM)) {
                    currWordLength = currWordLength * 10 + (ch - '0');
                    ch = str.charAt(++i);
                }
                i++;
            }
            StringBuilder sb = new StringBuilder();
            while(currWordLength > 0) {
                sb.append(str.charAt(i++));
                currWordLength--;
            }
            res.add(sb.toString());
        }
        return res;
    }
}
