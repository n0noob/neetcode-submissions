class Solution {
    private Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsetsCustom(nums, 0, new ArrayList<Integer>());
        return new ArrayList<>(res);
    }

    private void subsetsCustom(int[] nums, int start, List<Integer> subSet) {
        if (start >= nums.length) {
            res.add(subSet);
            return;
        }
        List<Integer> withCurrElement = new ArrayList<>(subSet);
        withCurrElement.add(nums[start]);
        // Choose the current element
        subsetsCustom(nums, start + 1, withCurrElement);

        // Don't choose the current element
        subsetsCustom(nums, start + 1, subSet);
    }
}