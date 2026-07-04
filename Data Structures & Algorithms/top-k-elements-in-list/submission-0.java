class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Frequency map is ready at this point, start putting entries into a priority queue
        PriorityQueue<Map.Entry<Integer, Integer>> freqQueue = new PriorityQueue<>((e1, e2) -> -1 *Integer.compare(e1.getValue(), e2.getValue()));

        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            freqQueue.offer(entry);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = freqQueue.poll().getKey();
        }

        return res;
    }
}