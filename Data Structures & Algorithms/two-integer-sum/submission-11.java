class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int[] solution = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            map.put(nums[i] , i);
            if(map.containsKey(complement)) {
                solution[0] = map.get(complement);
                solution[1] = map.get(nums[i]);
                return solution;
            }
        }
        return solution;
        
    }
}
