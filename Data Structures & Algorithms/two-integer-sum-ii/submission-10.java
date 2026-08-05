class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) 
                return new int[] {map.get(complement) + 1 , i + 1};
            map.put(nums[i] , i);
        }
        int n = nums.length;
        int left = 0, right = n-1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum > target) right--;
            else if(sum < target) left++;
            else if(sum == target) return new int[] {left + 1, right + 1}
        }

        return new int[] {-1 , -1};
    }
}
