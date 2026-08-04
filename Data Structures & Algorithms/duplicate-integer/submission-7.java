class Solution {
    public boolean hasDuplicate(int[] nums) {
        int result = 0;
        int xorResult = 0;
        for(int num : nums) {
            result += num;
            xorResult ^= num;
        }
        System.out.println(result + " " + xorResult);
        return result != xorResult? true:false;
        
    }
}