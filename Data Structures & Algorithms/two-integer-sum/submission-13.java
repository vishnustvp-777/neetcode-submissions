class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            map.put(nums[i] , i);
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement) , i};
            }
        }
        return new int[]{-1, -1};
        
    }
}
