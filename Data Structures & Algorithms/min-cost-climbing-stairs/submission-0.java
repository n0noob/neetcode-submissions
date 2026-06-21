class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];

        dp[0] = cost[0];
        dp[1] = cost[1];

        int costOfCurrentFloor = 0;
        for (int i = 2; i <= cost.length; i++) {
            if (i == cost.length) {
                costOfCurrentFloor = 0;
            } else {
                costOfCurrentFloor = cost[i];
            }

            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + costOfCurrentFloor;
        }

        return dp[cost.length];
    }
}
