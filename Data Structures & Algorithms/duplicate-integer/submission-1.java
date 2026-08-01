class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums) if(seen.contains(nums)) return true;
        return false;
    }
}