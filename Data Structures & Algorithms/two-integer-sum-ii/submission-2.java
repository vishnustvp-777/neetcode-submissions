class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!seen.contains(nums[i])) {
                map.put(nums[i] , i);
                seen.add(nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(seen.contains(complement)) return new int[] {map.get(complement) , i};
        }

        return new int[] {-1 , -1};
    }
}
