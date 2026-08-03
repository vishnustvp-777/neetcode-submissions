class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0) + 1);
        }
        Collections.sort(freq , (freq.get(a), freq.get(b)) -> Integer.compare(b,a));

        int[] solution = new int[k];
        
        int j = 0;
        for(int key : map.keySet()) {
            if(j < k) {
                solution[j] = key;
                j++;
            }
            else break;
        }
        return solution;
    }
}
