class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            switch(currChar) {
                case '{':
                case '[':
                case '(':
                    stack.push(currChar);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.size() == 0) {
                        return false;
                    }
                    char poppedChar = stack.pop();
                    if ((currChar == ')' && poppedChar != '(') || (currChar == '}' && poppedChar != '{') || (currChar == ']' && poppedChar != '[')) {
                        return false;
                    }
                    break;
            }
        }
        return stack.size() == 0;
    }
}