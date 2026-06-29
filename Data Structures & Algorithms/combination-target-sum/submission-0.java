class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSumInternal(candidates, target, 0, new ArrayList<>());
        return res;
    }

    private void combinationSumInternal(int[] candidates, int target, int ptr, List<Integer> currCombination) {
        if (target == 0) {
            res.add(new ArrayList<>(currCombination));
            return;
        } else if (target < 0 || ptr == candidates.length) {
            return;
        }
        // Pick current candidate and move
        // currCombination.add(candidates[ptr]);
        // combinationSumInternal(candidates, target - candidates[ptr], ptr + 1, currCombination);
        // currCombination.removeLast();
        
        // Pick current candidate and stay at same point
        currCombination.add(candidates[ptr]);
        combinationSumInternal(candidates, target - candidates[ptr], ptr, currCombination);
        currCombination.removeLast();

        // Ignore current candidate
        combinationSumInternal(candidates, target, ptr + 1, currCombination);
    }
}