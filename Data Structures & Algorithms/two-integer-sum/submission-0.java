class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++) {
            int subtract = target - nums[i];
            Integer pos = cache.get(subtract);
            if (pos != null) {
                return new int[]{pos, i};
            }
            cache.put(nums[i], i);
        }
        throw new IllegalArgumentException("Solution is guarunteed");
    }
}