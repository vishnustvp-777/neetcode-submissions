class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums) {
            seen.contains(num)? return true:seen.add(num);
            //if(seen.contains(num)) return true;
            //else seen.add(num);
        }
        return false;
    }
}