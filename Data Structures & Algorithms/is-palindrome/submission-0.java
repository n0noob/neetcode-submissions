class Solution {
    public boolean isPalindrome(String s) {
        int originalStringSize = s.length();
        char[] arr = new char[originalStringSize];
        int digitCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                arr[digitCount++] = Character.toLowerCase(currentChar);
            }
        }

        int mid = digitCount/2;

        while(mid > 0) {
            if (arr[mid - 1] != arr[digitCount - mid]) {
                return false;
            }
            mid--;
        }
        return true;
    }
}