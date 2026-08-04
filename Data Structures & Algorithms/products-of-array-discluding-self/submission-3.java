class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        for(int num : nums) totalProduct *= num;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) continue;
            nums[i] = totalProduct / nums[i];
        }
        return nums;
    }
}  
