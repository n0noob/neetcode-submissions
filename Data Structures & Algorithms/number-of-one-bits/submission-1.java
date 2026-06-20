class Solution {
    public int hammingWeight(int n) {
        int tempNum = n;
        int setBitCount = 0;
        while(tempNum != 0) {
            if ((tempNum & 1) == 1) {
                setBitCount++;
            }
            tempNum = tempNum >>> 1;
        }
        return setBitCount;
    }
}
