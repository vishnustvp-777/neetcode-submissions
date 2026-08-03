class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: count frequencies
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        // Step 2: get keys as list and sort by frequency descending
        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a, b) -> Integer.compare(freq.get(b), freq.get(a)));

        // Step 3: take top k from sorted list
        int[] solution = new int[k];
        for(int j = 0; j < k; j++)
            solution[j] = keys.get(j);

        return solution;
    }
}