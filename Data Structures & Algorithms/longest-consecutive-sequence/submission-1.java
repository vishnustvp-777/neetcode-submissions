class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int currentCount = 0;
        int maxCount = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) currentCount++;
            else currentCount = 0;
            maxCount = Math.max(currentCount , maxCount);
        }
        return maxCount;
    }
}
