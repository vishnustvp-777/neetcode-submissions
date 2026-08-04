class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        Arrays.sort(nums);
        int currentCount = 1;
        int maxCount = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) {
                currentCount++;
                maxCount = Math.max(currentCount , maxCount);
            }
            else if(nums[i] == nums[i-1]) continue;
            else currentCount = 1;
            
        }
        return maxCount;
    }
}
