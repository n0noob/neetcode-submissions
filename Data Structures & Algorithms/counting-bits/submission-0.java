class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            // count of set bits of i can be calculated by finding count if set bits of i/2 & LSD of i
            dp[i] = dp[i >> 1] + (i & 1);
        }

        return dp;
    }
}