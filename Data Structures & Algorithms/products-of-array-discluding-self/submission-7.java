class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int n = nums.length;
        int zeroCount = 0;
        for(int num : nums) {
            if(num == 0) {
                zeroCount++;
                continue;
            }
            totalProduct *= num;
        }
        for(int i = 0; i < n; i++) {
            if(zeroCount == 1) {
                if(nums[i] != 0) nums[i] = 0;
                else nums[i] = totalProduct;
            }
            else if(zeroCount > 1) {
                nums[i] = 0;
            }
            else if(zeroCount == 0) {
            nums[i] = totalProduct / nums[i];
            }
        }
        return nums;
    }
}  
