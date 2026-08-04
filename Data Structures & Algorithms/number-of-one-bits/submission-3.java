class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            int twoBits = n & 3;
            n = n >> 2;
            if (twoBits == 1 || twoBits == 2) {
                count++;
            } else if (twoBits == 3) {
                count += 2;
            }
        }
        return count;
    }
}