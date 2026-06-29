class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsetsCustom(nums, 0, new ArrayList<Integer>());
        return res;
    }

    private void subsetsCustom(int[] nums, int start, List<Integer> subSet) {
        if (start >= nums.length) {
            res.add(new ArrayList<>(subSet));
            return;
        }
        // Don't choose the current element
        subsetsCustom(nums, start + 1, subSet);

        // Choose the current element
        subSet.add(nums[start]);
        subsetsCustom(nums, start + 1, subSet);
        subSet.removeLast();
    }
}