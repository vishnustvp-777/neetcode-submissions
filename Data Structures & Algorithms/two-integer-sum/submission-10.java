class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int[] solution = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int complement = target - num;
            map.put(num , i);
            if(map.containsKey(complement)) {
                solution[0] = map.get(complement);
                solution[1] = map.get(num);
                return solution;
            }
        }
        return solution;
        
    }
}
