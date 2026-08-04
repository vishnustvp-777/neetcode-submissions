class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(i == 0)  prefix[i] = nums[i];
            else prefix[i] = prefix[i-1] * nums[i];
        }

        for(int i = n-1; i >= 0; i--) {
            if(i == n-1) postfix[i] = nums[i];
            else postfix[i] = nums[i] * postfix[i+1];
        }

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                nums[i] = postfix[i+1];
            }
            else if(i == n-1){
                nums[i] = prefix[i-1];
            }
            else {
                nums[i] = prefix[i-1] * postfix[i+1];
            }
        }
        return nums;
    }
}  
