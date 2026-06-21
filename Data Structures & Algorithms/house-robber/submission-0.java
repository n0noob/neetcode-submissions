class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] maxLootMoney = new int[nums.length];
        
        maxLootMoney[0] = nums[0];
        maxLootMoney[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            maxLootMoney[i] = Math.max(nums[i] + maxLootMoney[i-2], maxLootMoney[i-1]);
        }

        return Math.max(maxLootMoney[nums.length-2], maxLootMoney[nums.length-1]);
    }
}
