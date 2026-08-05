class Solution {
    public int[] twoSum(int[] nums, int target) {
       //HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(i+1 , nums[i]);

            int complement = target - nums[i];
            if(map.containsValue(complement)) 
                return new int[] {map.get(complement) , i};
        }

        return new int[] {-1 , -1};
    }
}
