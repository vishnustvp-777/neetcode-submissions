class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int[] solution = new int[2];
        for(int num : nums) {
            int complement = target - num;
            map.put(num , complement);
            if(map.containsKey(complement)) {
                solution[0] = map.get(complement);
                solution[1] = map.get(num);
                return solution;
            }
        }
        return solution;
        
    }
}
