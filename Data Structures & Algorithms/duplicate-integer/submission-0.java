class Solution {
    public boolean hasDuplicate(int[] nums) {
        int result = 0;
        for(int num : nums) result ^= num;
        return result==0? false:true;
    }
}