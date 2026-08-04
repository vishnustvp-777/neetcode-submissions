class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        for(int num : nums) {
            if(num == 0) continue;
            else totalProduct *= num;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) nums[i] = totalProduct;
            else nums[i] = totalProduct / nums[i];
        }
        return nums;
    }
}  
