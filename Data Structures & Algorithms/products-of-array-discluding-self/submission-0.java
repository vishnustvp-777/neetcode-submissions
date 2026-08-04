class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        for(int num : nums) totalProduct *= num;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = totalProduct / nums[i];
        }
        return nums;
    }
}  
