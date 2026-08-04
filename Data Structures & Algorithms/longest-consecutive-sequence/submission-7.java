class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        HashSet seen = new HashSet<>();
        for(int num : nums) set.add(num);

        int currentCount = 1;
        int maxCount = 1;
        
        for(int val : set) {
            if(!set.contains(val-1) && !seen.contains(val)) 
            {
                currentCount = 1;
                seen.add(val);
                int length = 1;
                while(set.contains(val+length)) {
                    currentCount++;
                    seen.add(val+length);
                    length++;
                }
                maxCount = Math.max(currentCount , maxCount);
            }
        }
        return maxCount;
    }
}
