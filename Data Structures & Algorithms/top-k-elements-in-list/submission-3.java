class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        //count the frequency of elements
        for(int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0) + 1);
        }
        //sort the keys based on the values in the hashmap
        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a,b) -> Integer.compare(freq.get(b), freq.get(a)));

        //put the top k elements in the solution array
        int[] solution = new int[k];
        for(int i = 0; i < k; i++) solution[i] = keys.get(i);

        return solution;

    }
}